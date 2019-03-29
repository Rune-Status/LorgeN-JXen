package org.tanberg.jxen.api;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import com.google.common.collect.Maps;
import com.google.common.reflect.ClassPath;

import java.io.IOException;
import java.util.Map;

public class EndpointHandler {

    private static final Map<Class<? extends Endpoint<?>>, ConstructorAccess<? extends Endpoint<?>>> CONSTRUCTORS = Maps.newHashMap();

    static {
        init();
    }

    @SuppressWarnings(value = { "UnstableApiUsage", "unchecked"})
    private static void init() {
        try {
            ClassPath.from(Thread.currentThread().getContextClassLoader())
              .getTopLevelClasses()
              .stream()
              .filter(info -> info.getPackageName().contains("org.tanberg.jxen.api"))
              .map(ClassPath.ClassInfo::load)
              .filter(clazz -> Endpoint.class.isAssignableFrom(clazz) && clazz != Endpoint.class)
              .map(clazz -> (Class<? extends Endpoint<?>>) clazz)
              .forEach(clazz -> {
                  System.out.println("Attempting to register " + clazz.getSimpleName() + "..");
                  CONSTRUCTORS.put(clazz, ConstructorAccess.get(clazz));
              });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Endpoint> T getByClass(Class<? extends Endpoint<?>> clazz) {
        return (T) CONSTRUCTORS.get(clazz).newInstance();
    }
}

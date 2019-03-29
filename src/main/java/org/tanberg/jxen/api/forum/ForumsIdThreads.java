package org.tanberg.jxen.api.forum;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.forum.Page;
import org.tanberg.jxen.entity.forum.thread.Thread;
import org.tanberg.jxen.util.RestMethod;
import org.tanberg.jxen.util.Tuple;

public class ForumsIdThreads extends Endpoint<Tuple<Thread[], Page, Thread[]>> {

    protected ForumsIdThreads(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public Tuple<Thread[], Page, Thread[]> callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

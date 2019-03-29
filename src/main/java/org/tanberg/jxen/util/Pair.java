package org.tanberg.jxen.util;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class Pair<K, V> {

    private final K type1;
    private final V type2;

    public Pair(K type1, V type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public K getType1() {
        return this.type1;
    }

    public V getType2() {
        return this.type2;
    }
}

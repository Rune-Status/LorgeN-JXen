package org.tanberg.jxen.util;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class Tuple<A, B, C> {

    private final A type1;
    private final B type2;
    private final C type3;

    public Tuple(A type1, B type2, C type3) {
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
    }

    public A getType1() {
        return this.type1;
    }

    public B getType2() {
        return this.type2;
    }

    public C getType3() {
        return this.type3;
    }
}

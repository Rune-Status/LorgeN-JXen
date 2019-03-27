package org.tanberg.jxen.api;

import org.tanberg.jxen.util.RestMethod;

public abstract class Endpoint<T> {

    private final RestMethod method;
    private final String endpoint;

    protected Endpoint(RestMethod method, String endpoint) {
        this.method = method;
        this.endpoint = endpoint;
    }

    public abstract T callEndpoint(Object... args);

    public RestMethod getMethod() {
        return this.method;
    }

    public String getEndpoint() {
        return this.endpoint;
    }
}

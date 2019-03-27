package org.tanberg.jxen.api;

import org.tanberg.jxen.util.RestMethod;

public abstract class Endpoint<T> {

    private final RestMethod method;
    private final String endpoint;

    protected Endpoint(RestMethod method, String endpoint) {
        this.method = method;
        this.endpoint = endpoint;
    }

    // TODO: User context for super key
    // "If the API key selected is a super user key, you may pass the user ID of the context user via the
    // XF-Api-User header. If no user ID is passed, the context will default to a guest."
    public abstract T callEndpoint(Object... args);

    public RestMethod getMethod() {
        return this.method;
    }

    public String getEndpoint() {
        return this.endpoint;
    }
}

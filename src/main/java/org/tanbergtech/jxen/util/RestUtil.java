package org.tanbergtech.jxen.util;

import org.tanbergtech.jxen.api.Endpoint;

public class RestUtil<T> {

    private final String authKey;
    private final String baseUrl;

    public RestUtil(String authKey, String baseUrl) {
        this.authKey = authKey;
        this.baseUrl = baseUrl;
    }

    public <T> T get(Endpoint<?> endpoint) {
        return null;
    }
}

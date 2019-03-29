package org.tanberg.jxen.util;

import org.tanberg.jxen.JXen;
import org.tanberg.jxen.api.Endpoint;

import javax.annotation.Nullable;
import java.util.Map;

public class RestUtil<T> {

    private final String apiKey;
    private final String baseUrl;

    public RestUtil(@Nullable String apiKey, @Nullable String baseUrl) {
        this.apiKey = apiKey == null ? JXen.getJXenInstance().getApiKey() : apiKey;
        this.baseUrl = baseUrl == null ? JXen.getJXenInstance().getBaseUrl() : baseUrl;
    }

    public T get(Endpoint<?> endpoint, @Nullable Map<String, Object> parameters) {
        String url = this.baseUrl + endpoint.getEndpoint();

        return null;
    }
}

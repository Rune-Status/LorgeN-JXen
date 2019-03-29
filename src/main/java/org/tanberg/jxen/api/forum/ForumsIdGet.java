package org.tanberg.jxen.api.forum;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.util.RestMethod;

public class ForumsIdGet extends Endpoint<ForumResponse> {

    protected ForumsIdGet(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public ForumResponse callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

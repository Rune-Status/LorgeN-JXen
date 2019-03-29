package org.tanberg.jxen.api.auth;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.user.User;
import org.tanberg.jxen.util.RestMethod;

public class AuthPost extends Endpoint<User> {

    private static final RestMethod METHOD = RestMethod.POST;
    private static final String ENDPOINT = "/auth";

    public AuthPost() {
        super(METHOD, ENDPOINT);
    }

    @Override
    public User callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

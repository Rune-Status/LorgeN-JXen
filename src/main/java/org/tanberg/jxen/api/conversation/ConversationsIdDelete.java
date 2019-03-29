package org.tanberg.jxen.api.conversation;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.util.RestMethod;

public class ConversationsIdDelete extends Endpoint<Boolean> {

    protected ConversationsIdDelete(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public Boolean callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

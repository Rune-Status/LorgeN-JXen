package org.tanberg.jxen.api.conversation;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.conversation.Conversation;
import org.tanberg.jxen.util.Pair;
import org.tanberg.jxen.util.RestMethod;

public class ConversationsPost extends Endpoint<Pair<Boolean, Conversation>> {

    protected ConversationsPost(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public Pair<Boolean, Conversation> callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

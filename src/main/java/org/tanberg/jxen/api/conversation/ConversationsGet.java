package org.tanberg.jxen.api.conversation;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.conversation.Conversation;
import org.tanberg.jxen.entity.forum.Page;
import org.tanberg.jxen.util.Pair;
import org.tanberg.jxen.util.RestMethod;

public class ConversationsGet extends Endpoint<Pair<Conversation, Page>> {

    protected ConversationsGet(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public Pair<Conversation, Page> callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

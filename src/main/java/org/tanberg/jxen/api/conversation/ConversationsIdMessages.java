package org.tanberg.jxen.api.conversation;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.conversation.ConversationMessage;
import org.tanberg.jxen.entity.forum.Page;
import org.tanberg.jxen.util.Pair;
import org.tanberg.jxen.util.RestMethod;

public class ConversationsIdMessages extends Endpoint<Pair<ConversationMessage[], Page>> {

    protected ConversationsIdMessages(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public Pair<ConversationMessage[], Page> callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

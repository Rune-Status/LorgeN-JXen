package org.tanberg.jxen.api.conversation;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.conversation.Conversation;
import org.tanberg.jxen.entity.conversation.ConversationMessage;
import org.tanberg.jxen.entity.forum.Page;
import org.tanberg.jxen.util.RestMethod;
import org.tanberg.jxen.util.Tuple;

public class ConversationsIdGet extends Endpoint<Tuple<Conversation, ConversationMessage[], Page>> {

    protected ConversationsIdGet(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public Tuple<Conversation, ConversationMessage[], Page> callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

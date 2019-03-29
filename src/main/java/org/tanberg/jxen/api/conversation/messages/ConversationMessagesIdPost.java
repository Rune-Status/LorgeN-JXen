package org.tanberg.jxen.api.conversation.messages;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.conversation.ConversationMessage;
import org.tanberg.jxen.util.Pair;
import org.tanberg.jxen.util.RestMethod;

public class ConversationMessagesIdPost extends Endpoint<Pair<Boolean, ConversationMessage>> {

    protected ConversationMessagesIdPost(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public Pair<Boolean, ConversationMessage> callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

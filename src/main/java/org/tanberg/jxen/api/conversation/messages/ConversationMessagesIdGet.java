package org.tanberg.jxen.api.conversation.messages;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.conversation.ConversationMessage;
import org.tanberg.jxen.util.RestMethod;

public class ConversationMessagesIdGet extends Endpoint<ConversationMessage> {

    protected ConversationMessagesIdGet(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public ConversationMessage callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

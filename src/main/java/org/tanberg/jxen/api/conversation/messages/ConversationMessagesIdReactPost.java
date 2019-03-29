package org.tanberg.jxen.api.conversation.messages;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.util.Pair;
import org.tanberg.jxen.util.RestMethod;

public class ConversationMessagesIdReactPost extends Endpoint<Pair<Boolean, String>> {

    protected ConversationMessagesIdReactPost(RestMethod method, String endpoint) {
        super(method, endpoint);
    }

    @Override
    public Pair<Boolean, String> callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

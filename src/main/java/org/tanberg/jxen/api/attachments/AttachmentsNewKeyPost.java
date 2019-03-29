package org.tanberg.jxen.api.attachments;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.attachment.Attachment;
import org.tanberg.jxen.util.Pair;
import org.tanberg.jxen.util.RestMethod;

public class AttachmentsNewKeyPost extends Endpoint<Pair<String, Attachment>> {

    private static final RestMethod METHOD = RestMethod.POST;
    private static final String ENDPOINT = "/attachments/new-key";

    public AttachmentsNewKeyPost() {
        super(METHOD, ENDPOINT);
    }

    @Override
    public Pair<String, Attachment> callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

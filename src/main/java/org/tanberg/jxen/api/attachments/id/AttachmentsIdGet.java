package org.tanberg.jxen.api.attachments.id;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.attachment.Attachment;
import org.tanberg.jxen.util.RestMethod;

public class AttachmentsIdGet extends Endpoint<Attachment> {

    private static final RestMethod METHOD = RestMethod.GET;
    private static final String ENDPOINT = "/attachments/{id}";

    public AttachmentsIdGet() {
        super(METHOD, ENDPOINT);
    }

    @Override
    public Attachment callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

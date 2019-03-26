package org.tanbergtech.jxen.api.attachments;

import org.tanbergtech.jxen.api.Endpoint;
import org.tanbergtech.jxen.entity.attachment.Attachment;
import org.tanbergtech.jxen.util.RestMethod;

public class AttachmentsPost extends Endpoint<Attachment[]> {

    private static final RestMethod METHOD = RestMethod.POST;
    private static final String ENDPOINT = "/attachments";

    public AttachmentsPost() {
        super(METHOD, ENDPOINT);
    }

    @Override
    public Attachment[] callEndpoint(Object... args) {
        // TODO
        return null;
    }
}

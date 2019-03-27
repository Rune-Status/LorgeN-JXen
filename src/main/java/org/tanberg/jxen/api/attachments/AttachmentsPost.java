package org.tanberg.jxen.api.attachments;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.attachment.Attachment;
import org.tanberg.jxen.util.RestMethod;

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

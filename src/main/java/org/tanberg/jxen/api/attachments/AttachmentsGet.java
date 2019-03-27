package org.tanberg.jxen.api.attachments;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.attachment.Attachment;
import org.tanberg.jxen.util.RestMethod;

public class AttachmentsGet extends Endpoint<Attachment[]> {

    private static final RestMethod METHOD = RestMethod.GET;
    private static final String ENDPOINT = "/attachments";

    public AttachmentsGet() {
        super(METHOD, ENDPOINT);
    }

    @Override
    public Attachment[] callEndpoint(Object... args) {
        // TODO
        System.out.println("test");
        return null;
    }
}

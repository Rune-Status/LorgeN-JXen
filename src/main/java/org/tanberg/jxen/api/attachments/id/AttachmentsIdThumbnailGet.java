package org.tanberg.jxen.api.attachments.id;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.util.RestMethod;

public class AttachmentsIdThumbnailGet extends Endpoint<String> {

    private static final RestMethod METHOD = RestMethod.GET;
    private static final String ENDPOINT = "/attachments/{id}/thumbnail";

    public AttachmentsIdThumbnailGet() {
        super(METHOD, ENDPOINT);
    }

    @Override
    public String callEndpoint(Object... args) {
        return null;
    }

    @Override
    public Object toObject() {
        return null;
    }
}

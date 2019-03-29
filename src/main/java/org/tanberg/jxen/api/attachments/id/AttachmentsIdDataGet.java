package org.tanberg.jxen.api.attachments.id;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.util.RestMethod;

public class AttachmentsIdDataGet extends Endpoint<byte[]> {

    private static final RestMethod METHOD = RestMethod.GET;
    private static final String ENDPOINT = "/attachments/{id}/data";

    public AttachmentsIdDataGet() {
        super(METHOD, ENDPOINT);
    }

    @Override
    public byte[] callEndpoint(Object... args) {
        return new byte[0];
    }

    @Override
    public Object toObject() {
        return null;
    }
}

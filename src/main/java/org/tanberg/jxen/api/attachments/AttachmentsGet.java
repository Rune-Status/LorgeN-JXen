package org.tanberg.jxen.api.attachments;

import org.tanberg.jxen.api.Endpoint;
import org.tanberg.jxen.entity.attachment.Attachment;
import org.tanberg.jxen.util.RestMethod;
import org.tanberg.jxen.util.RestUtil;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AttachmentsGet extends Endpoint<Attachment[]> {

    private static final RestMethod METHOD = RestMethod.GET;
    private static final String ENDPOINT = "/attachments";

    private volatile Attachment[] attachments;

    public AttachmentsGet() {
        super(METHOD, ENDPOINT);
    }

    @Override
    public Attachment[] callEndpoint(Object... args) {
        this.attachments = new RestUtil<Attachment[]>(null, null).get(this, null);

        return this.attachments;
    }

    @Override
    public Set<Attachment> toObject() {
        if (this.attachments == null) {
            throw new IllegalStateException("Endpoint must be called before object conversion.");
        }

        return Stream.of(this.attachments).collect(Collectors.toSet());
    }
}

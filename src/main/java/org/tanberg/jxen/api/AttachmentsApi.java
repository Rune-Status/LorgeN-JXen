package org.tanberg.jxen.api;

import org.tanberg.jxen.entity.attachment.Attachment;
import org.tanberg.jxen.util.Pair;
import retrofit2.Call;
import retrofit2.http.*;

import java.io.File;
import java.util.Set;

public interface AttachmentsApi {

    @GET(value = "/attachments")
    Call<Set<Attachment>> getAttachments(
      @Query(value = "key") String key
    );

    @Multipart
    @POST(value = "/attachments")
    Call<Attachment> createAttachment(
      @Query(value = "key") String key,
      @Part(value = "file") File file
    );

    @Multipart
    @POST(value = "/attachments/new-key")
    Call<Pair<String, Attachment>> createAttachmentKey(
      @Query(value = "type") String type,
      @Query(value = "context") String[] context,
      @Part(value = "file") File file
    );

    @GET(value = "/attachments/{id}/")
    Call<Attachment> getAttachment(
      @Path(value = "id") String id
    );

    @DELETE(value = "/attachments/{id}")
    Call<Boolean> deleteAttachment(
      @Path(value = "id") String id
    );

    @GET(value = "/attachments/{id}/data")
    Call<byte[]> getAttachmentData(
      @Path(value = "id") String id
    );

    @GET(value = "/attachments/{id}/thumbnail")
    Call<String> getAttachmentThumbnail(
      @Path(value = "id") String id
    );
}

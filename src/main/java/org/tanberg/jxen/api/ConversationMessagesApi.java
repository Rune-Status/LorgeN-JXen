package org.tanberg.jxen.api;

import org.tanberg.jxen.entity.conversation.ConversationMessage;
import org.tanberg.jxen.util.Pair;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ConversationMessagesApi {

    @POST(value = "/conversation-messages")
    Call<Pair<Boolean, ConversationMessage>> postMessage(
      @Query(value = "conversation_id") int conversationId,
      @Query(value = "message") String message,
      @Query(value = "attachment_key") String attachmentKey
    );

    @GET(value = "/conversation-messages/{id}")
    Call<ConversationMessage> getMessage(
      @Path(value = "id") String id
    );

    @POST(value = "/conversation-messages/{id}")
    Call<Pair<Boolean, ConversationMessage>> updateMessage(
      @Path(value = "id") String id,
      @Query(value = "message") String message,
      @Query(value = "attachment_key") String attachmentKey
    );

    @POST(value = "/conversation-messages/{id}/react")
    Call<Pair<Boolean, String>> reactToMessage(
      @Path(value = "id") String id,
      @Query(value = "reaction_id") String reactionId
    );
}

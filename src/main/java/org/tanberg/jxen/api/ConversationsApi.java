package org.tanberg.jxen.api;

import org.tanberg.jxen.entity.conversation.Conversation;
import org.tanberg.jxen.entity.forum.Page;
import org.tanberg.jxen.util.Pair;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.Set;

public interface ConversationsApi {

    @GET(value = "/conversations")
    Call<Pair<Set<Conversation>, Page>> getConversations(
      @Query(value = "page") int page
    );

    @POST(value = "/conversations")
    Call<Pair<Boolean, Conversation>> createConversation(
      @Query(value = "recipient_ids") int[] userIds,
      @Query(value = "title") String title,
      @Query(value = "message") String message,
      @Query(value = "attachment_key") String attachmentKey,
      @Query(value = "conversation_open") boolean isOpen,
      @Query(value = "open_invite") boolean isOpenInvite
    );
}

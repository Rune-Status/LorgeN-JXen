package org.tanberg.jxen.entity.conversation;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.attachment.Attachment;
import org.tanberg.jxen.entity.user.User;

public class ConversationMessage {

    @JsonProperty("username")
    private String username;

    @JsonProperty("can_edit")
    private boolean canEdit;

    @JsonProperty("can_react")
    private boolean canReact;

    @JsonProperty("Conversation")
    private Conversation conversation;

    @JsonProperty("Attachments")
    private Attachment[] attachments;

    @JsonProperty("is_reacted_to")
    private boolean isReactedTo;

    @JsonProperty("visitor_reaction_id")
    private int visitorReactionId;

    @JsonProperty("message_id")
    private int messageId;

    @JsonProperty("conversation_id")
    private int conversationId;

    @JsonProperty("message_date")
    private int messageDate;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("message")
    private String message;

    @JsonProperty("attach_count")
    private int attachCount;

    @JsonProperty("reaction_score")
    private int reactionScore;

    @JsonProperty("User")
    private User user;

    public ConversationMessage() {
    }

    public ConversationMessage(String username, boolean canEdit, boolean canReact, Conversation conversation,
                               Attachment[] attachments, boolean isReactedTo, int visitorReactionId, int messageId,
                               int conversationId, int messageDate, int userId, String message, int attachCount,
                               int reactionScore, User user) {
        this.username = username;
        this.canEdit = canEdit;
        this.canReact = canReact;
        this.conversation = conversation;
        this.attachments = attachments;
        this.isReactedTo = isReactedTo;
        this.visitorReactionId = visitorReactionId;
        this.messageId = messageId;
        this.conversationId = conversationId;
        this.messageDate = messageDate;
        this.userId = userId;
        this.message = message;
        this.attachCount = attachCount;
        this.reactionScore = reactionScore;
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanReact() {
        return canReact;
    }

    public void setCanReact(boolean canReact) {
        this.canReact = canReact;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public Attachment[] getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachment[] attachments) {
        this.attachments = attachments;
    }

    public boolean isReactedTo() {
        return isReactedTo;
    }

    public void setReactedTo(boolean reactedTo) {
        isReactedTo = reactedTo;
    }

    public int getVisitorReactionId() {
        return visitorReactionId;
    }

    public void setVisitorReactionId(int visitorReactionId) {
        this.visitorReactionId = visitorReactionId;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getConversationId() {
        return conversationId;
    }

    public void setConversationId(int conversationId) {
        this.conversationId = conversationId;
    }

    public int getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(int messageDate) {
        this.messageDate = messageDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getAttachCount() {
        return attachCount;
    }

    public void setAttachCount(int attachCount) {
        this.attachCount = attachCount;
    }

    public int getReactionScore() {
        return reactionScore;
    }

    public void setReactionScore(int reactionScore) {
        this.reactionScore = reactionScore;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

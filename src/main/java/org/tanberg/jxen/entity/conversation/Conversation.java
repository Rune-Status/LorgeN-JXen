package org.tanberg.jxen.entity.conversation;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.generic.GenericEntity;
import org.tanberg.jxen.entity.user.User;

public class Conversation {

    @JsonProperty("username")
    private String username;

    @JsonProperty("recipients")
    private GenericEntity recipients; // TODO: Refactor this into proper object

    @JsonProperty("is_starred")
    private boolean isStarred;

    @JsonProperty("can_edit")
    private boolean canEdit;

    @JsonProperty("can_reply")
    private boolean canReply;

    @JsonProperty("can_invite")
    private boolean canInvite;

    @JsonProperty("can_upload_attachment")
    private boolean canUploadAttachment;

    @JsonProperty("conversation_id")
    private int conversationId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("start_date")
    private int startDate;

    @JsonProperty("open_invite")
    private boolean openInvite;

    @JsonProperty("conversation_open")
    private boolean conversationOpen;

    @JsonProperty("reply_count")
    private int replyCount;

    @JsonProperty("recipient_count")
    private int recipientCount;

    @JsonProperty("first_message_id")
    private int firstMessageId;

    @JsonProperty("last_message_date")
    private int lastMessageDate;

    @JsonProperty("last_message_id")
    private int lastMessageId;

    @JsonProperty("last_message_used_id")
    private int lastMessageUserId;

    @JsonProperty("Starter")
    private User starter;

    public Conversation() {
    }

    public Conversation(String username, GenericEntity recipients, boolean isStarred, boolean canEdit, boolean canReply,
                        boolean canInvite, boolean canUploadAttachment, int conversationId, String title, int userId,
                        int startDate, boolean openInvite, boolean conversationOpen, int replyCount, int recipientCount,
                        int firstMessageId, int lastMessageDate, int lastMessageId, int lastMessageUserId, User starter) {
        this.username = username;
        this.recipients = recipients;
        this.isStarred = isStarred;
        this.canEdit = canEdit;
        this.canReply = canReply;
        this.canInvite = canInvite;
        this.canUploadAttachment = canUploadAttachment;
        this.conversationId = conversationId;
        this.title = title;
        this.userId = userId;
        this.startDate = startDate;
        this.openInvite = openInvite;
        this.conversationOpen = conversationOpen;
        this.replyCount = replyCount;
        this.recipientCount = recipientCount;
        this.firstMessageId = firstMessageId;
        this.lastMessageDate = lastMessageDate;
        this.lastMessageId = lastMessageId;
        this.lastMessageUserId = lastMessageUserId;
        this.starter = starter;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public GenericEntity getRecipients() {
        return recipients;
    }

    public void setRecipients(GenericEntity recipients) {
        this.recipients = recipients;
    }

    public boolean isStarred() {
        return isStarred;
    }

    public void setStarred(boolean starred) {
        isStarred = starred;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanReply() {
        return canReply;
    }

    public void setCanReply(boolean canReply) {
        this.canReply = canReply;
    }

    public boolean isCanInvite() {
        return canInvite;
    }

    public void setCanInvite(boolean canInvite) {
        this.canInvite = canInvite;
    }

    public boolean isCanUploadAttachment() {
        return canUploadAttachment;
    }

    public void setCanUploadAttachment(boolean canUploadAttachment) {
        this.canUploadAttachment = canUploadAttachment;
    }

    public int getConversationId() {
        return conversationId;
    }

    public void setConversationId(int conversationId) {
        this.conversationId = conversationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public boolean isOpenInvite() {
        return openInvite;
    }

    public void setOpenInvite(boolean openInvite) {
        this.openInvite = openInvite;
    }

    public boolean isConversationOpen() {
        return conversationOpen;
    }

    public void setConversationOpen(boolean conversationOpen) {
        this.conversationOpen = conversationOpen;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getRecipientCount() {
        return recipientCount;
    }

    public void setRecipientCount(int recipientCount) {
        this.recipientCount = recipientCount;
    }

    public int getFirstMessageId() {
        return firstMessageId;
    }

    public void setFirstMessageId(int firstMessageId) {
        this.firstMessageId = firstMessageId;
    }

    public int getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(int lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public int getLastMessageId() {
        return lastMessageId;
    }

    public void setLastMessageId(int lastMessageId) {
        this.lastMessageId = lastMessageId;
    }

    public int getLastMessageUserId() {
        return lastMessageUserId;
    }

    public void setLastMessageUserId(int lastMessageUserId) {
        this.lastMessageUserId = lastMessageUserId;
    }

    public User getStarter() {
        return starter;
    }

    public void setStarter(User starter) {
        this.starter = starter;
    }
}

package org.tanberg.jxen.entity.forum.post;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.attachment.Attachment;
import org.tanberg.jxen.entity.user.User;

public class Post {

    @JsonProperty("username")
    private String username;

    @JsonProperty("is_first_post")
    private boolean isFirstPost;

    @JsonProperty("is_last_post")
    private boolean isLastPost;

    @JsonProperty("can_edit")
    private boolean canEdit;

    @JsonProperty("can_soft_delete")
    private boolean canSoftDelete;

    @JsonProperty("can_hard_delete")
    private boolean canHardDelete;

    @JsonProperty("can_react")
    private boolean canReact;

    @JsonProperty("can_view_attachments")
    private boolean canViewAttachments;

    @JsonProperty("Thread")
    private Thread thread;

    @JsonProperty("Attachments")
    private Attachment[] attachments;

    @JsonProperty("is_reacted_to")
    private boolean isReactedTo;

    @JsonProperty("visitor_reaction_id")
    private int visitorReactionId;

    @JsonProperty("post_id")
    private int postId;

    @JsonProperty("thread_id")
    private int threadId;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("post_date")
    private int postDate;

    @JsonProperty("message")
    private String message;

    @JsonProperty("message_state")
    private String messageState;

    @JsonProperty("attach_count")
    private int attachCount;

    @JsonProperty("warning_message")
    private String warningMessage;

    @JsonProperty("position")
    private int position;

    @JsonProperty("last_edit_date")
    private int lastEditDate;

    @JsonProperty("reaction_score")
    private int reactionScore;

    @JsonProperty("User")
    private User user;

    public Post() {
    }

    // TODO: Builder?
    public Post(String username, boolean isFirstPost, boolean isLastPost, boolean canEdit, boolean canSoftDelete, boolean canHardDelete, boolean canReact, boolean canViewAttachments, Thread thread, Attachment[] attachments, boolean isReactedTo, int visitorReactionId, int postId, int threadId, int userId, int postDate, String message, String messageState, int attachCount, String warningMessage, int position, int lastEditDate, int reactionScore, User user) {
        this.username = username;
        this.isFirstPost = isFirstPost;
        this.isLastPost = isLastPost;
        this.canEdit = canEdit;
        this.canSoftDelete = canSoftDelete;
        this.canHardDelete = canHardDelete;
        this.canReact = canReact;
        this.canViewAttachments = canViewAttachments;
        this.thread = thread;
        this.attachments = attachments;
        this.isReactedTo = isReactedTo;
        this.visitorReactionId = visitorReactionId;
        this.postId = postId;
        this.threadId = threadId;
        this.userId = userId;
        this.postDate = postDate;
        this.message = message;
        this.messageState = messageState;
        this.attachCount = attachCount;
        this.warningMessage = warningMessage;
        this.position = position;
        this.lastEditDate = lastEditDate;
        this.reactionScore = reactionScore;
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFirstPost() {
        return isFirstPost;
    }

    public void setFirstPost(boolean firstPost) {
        isFirstPost = firstPost;
    }

    public boolean isLastPost() {
        return isLastPost;
    }

    public void setLastPost(boolean lastPost) {
        isLastPost = lastPost;
    }

    public boolean canEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean canSoftDelete() {
        return canSoftDelete;
    }

    public void setCanSoftDelete(boolean canSoftDelete) {
        this.canSoftDelete = canSoftDelete;
    }

    public boolean isCanHardDelete() {
        return canHardDelete;
    }

    public void setCanHardDelete(boolean canHardDelete) {
        this.canHardDelete = canHardDelete;
    }

    public boolean canReact() {
        return canReact;
    }

    public void setCanReact(boolean canReact) {
        this.canReact = canReact;
    }

    public boolean canViewAttachments() {
        return canViewAttachments;
    }

    public void setCanViewAttachments(boolean canViewAttachments) {
        this.canViewAttachments = canViewAttachments;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
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

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostDate() {
        return postDate;
    }

    public void setPostDate(int postDate) {
        this.postDate = postDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageState() {
        return messageState;
    }

    public void setMessageState(String messageState) {
        this.messageState = messageState;
    }

    public int getAttachCount() {
        return attachCount;
    }

    public void setAttachCount(int attachCount) {
        this.attachCount = attachCount;
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(int lastEditDate) {
        this.lastEditDate = lastEditDate;
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

package org.tanberg.jxen.entity.forum.post.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.user.User;

public class ProfilePostComment {

    @JsonProperty("username")
    private String username;

    @JsonProperty("can_edit")
    private boolean canEdit;

    @JsonProperty("can_soft_delete")
    private boolean canSoftdelete;

    @JsonProperty("can_hard_delete")
    private boolean canHardDelete;

    @JsonProperty("can_react")
    private boolean canReact;

    @JsonProperty("profile_post")
    private ProfilePost profilePost;

    @JsonProperty("is_reacted_to")
    private boolean isReactedTo;

    @JsonProperty("visitor_reaction_id")
    private int visitorReactionId;

    @JsonProperty("profile_post_comment_id")
    private int profilePostCommentId;

    @JsonProperty("profile_post_id")
    private int profilePostId;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("comment_date")
    private int commentDate;

    @JsonProperty("message")
    private String message;

    @JsonProperty("message_state")
    private String messageState;

    @JsonProperty("warning_message")
    private String warningMessage;

    @JsonProperty("reaction_score")
    private int reactionScore;

    @JsonProperty("User")
    private User user;

    public ProfilePostComment() {
    }

    public ProfilePostComment(String username, boolean canEdit, boolean canSoftdelete, boolean canHardDelete,
                              boolean canReact, ProfilePost profilePost, boolean isReactedTo, int visitorReactionId,
                              int profilePostCommentId, int profilePostId, int userId, int commentDate, String message,
                              String messageState, String warningMessage, int reactionScore, User user) {
        this.username = username;
        this.canEdit = canEdit;
        this.canSoftdelete = canSoftdelete;
        this.canHardDelete = canHardDelete;
        this.canReact = canReact;
        this.profilePost = profilePost;
        this.isReactedTo = isReactedTo;
        this.visitorReactionId = visitorReactionId;
        this.profilePostCommentId = profilePostCommentId;
        this.profilePostId = profilePostId;
        this.userId = userId;
        this.commentDate = commentDate;
        this.message = message;
        this.messageState = messageState;
        this.warningMessage = warningMessage;
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

    public boolean isCanSoftdelete() {
        return canSoftdelete;
    }

    public void setCanSoftdelete(boolean canSoftdelete) {
        this.canSoftdelete = canSoftdelete;
    }

    public boolean isCanHardDelete() {
        return canHardDelete;
    }

    public void setCanHardDelete(boolean canHardDelete) {
        this.canHardDelete = canHardDelete;
    }

    public boolean isCanReact() {
        return canReact;
    }

    public void setCanReact(boolean canReact) {
        this.canReact = canReact;
    }

    public ProfilePost getProfilePost() {
        return profilePost;
    }

    public void setProfilePost(ProfilePost profilePost) {
        this.profilePost = profilePost;
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

    public int getProfilePostCommentId() {
        return profilePostCommentId;
    }

    public void setProfilePostCommentId(int profilePostCommentId) {
        this.profilePostCommentId = profilePostCommentId;
    }

    public int getProfilePostId() {
        return profilePostId;
    }

    public void setProfilePostId(int profilePostId) {
        this.profilePostId = profilePostId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(int commentDate) {
        this.commentDate = commentDate;
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

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
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

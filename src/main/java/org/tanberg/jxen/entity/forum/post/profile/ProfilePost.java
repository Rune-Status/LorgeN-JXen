package org.tanberg.jxen.entity.forum.post.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.user.User;

public class ProfilePost {

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

    @JsonProperty("ProfileUser")
    private User profileUser;

    @JsonProperty("LatestComments")
    private ProfilePostComment[] latestComments;

    @JsonProperty("is_reacted_to")
    private boolean isReactedTo;

    @JsonProperty("visitor_reaction_id")
    private int visitorReactionId;

    @JsonProperty("profile_post_id")
    private int profilePostId;

    @JsonProperty("profile_user_id")
    private int profileUserId;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("post_date")
    private int postDate;

    @JsonProperty("message")
    private String message;

    @JsonProperty("message_state")
    private String messageState;

    @JsonProperty("warning_message")
    private String warningMessage;

    @JsonProperty("comment_count")
    private int commentCount;

    @JsonProperty("first_comment_date")
    private int firstCommentDate;

    @JsonProperty("last_comment_date")
    private int lastCommentDate;

    @JsonProperty("reaction_score")
    private int reactionScore;

    @JsonProperty("User")
    private User user;

    public ProfilePost() {
    }

    public ProfilePost(String username, boolean canEdit, boolean canSoftdelete, boolean canHardDelete, boolean canReact,
                       User profileUser, ProfilePostComment[] latestComments, boolean isReactedTo, int visitorReactionId,
                       int profilePostId, int profileUserId, int userId, int postDate, String message, String messageState,
                       String warningMessage, int commentCount, int firstCommentDate, int lastCommentDate, int reactionScore, User user) {
        this.username = username;
        this.canEdit = canEdit;
        this.canSoftdelete = canSoftdelete;
        this.canHardDelete = canHardDelete;
        this.canReact = canReact;
        this.profileUser = profileUser;
        this.latestComments = latestComments;
        this.isReactedTo = isReactedTo;
        this.visitorReactionId = visitorReactionId;
        this.profilePostId = profilePostId;
        this.profileUserId = profileUserId;
        this.userId = userId;
        this.postDate = postDate;
        this.message = message;
        this.messageState = messageState;
        this.warningMessage = warningMessage;
        this.commentCount = commentCount;
        this.firstCommentDate = firstCommentDate;
        this.lastCommentDate = lastCommentDate;
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

    public User getProfileUser() {
        return profileUser;
    }

    public void setProfileUser(User profileUser) {
        this.profileUser = profileUser;
    }

    public ProfilePostComment[] getLatestComments() {
        return latestComments;
    }

    public void setLatestComments(ProfilePostComment[] latestComments) {
        this.latestComments = latestComments;
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

    public int getProfilePostId() {
        return profilePostId;
    }

    public void setProfilePostId(int profilePostId) {
        this.profilePostId = profilePostId;
    }

    public int getProfileUserId() {
        return profileUserId;
    }

    public void setProfileUserId(int profileUserId) {
        this.profileUserId = profileUserId;
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

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getFirstCommentDate() {
        return firstCommentDate;
    }

    public void setFirstCommentDate(int firstCommentDate) {
        this.firstCommentDate = firstCommentDate;
    }

    public int getLastCommentDate() {
        return lastCommentDate;
    }

    public void setLastCommentDate(int lastCommentDate) {
        this.lastCommentDate = lastCommentDate;
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

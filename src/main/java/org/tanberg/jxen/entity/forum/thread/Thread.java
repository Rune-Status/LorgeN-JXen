package org.tanberg.jxen.entity.forum.thread;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.forum.Node;
import org.tanberg.jxen.entity.generic.GenericEntity;
import org.tanberg.jxen.entity.user.User;

public class Thread {

    @JsonProperty("username")
    private String username;

    @JsonProperty("is_watching")
    private boolean isWatching;

    @JsonProperty("visitor_post_count")
    private int visitorPostCount;

    @JsonProperty("custom_fields")
    private GenericEntity customFields;

    @JsonProperty("tags")
    private String[] tags;

    @JsonProperty("prefix")
    private String prefix;

    @JsonProperty("can_edit")
    private boolean canEdit;

    @JsonProperty("can_edit_tags")
    private boolean canEditTags;

    @JsonProperty("can_reply")
    private boolean canReply;

    @JsonProperty("can_soft_delete")
    private boolean canSoftDelete;

    @JsonProperty("can_hard_delete")
    private boolean canHardDelete;

    @JsonProperty("can_view_attachments")
    private boolean canViewAttachments;

    @JsonProperty("Forum")
    private Node forum;

    @JsonProperty("thread_id")
    private int threadId;

    @JsonProperty("node_id")
    private int nodeId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("reply_count")
    private int replyCount;

    @JsonProperty("view_count")
    private int viewCount;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("post_date")
    private int postDate;

    @JsonProperty("sticky")
    private boolean sticky;

    @JsonProperty("discussion_state")
    private String discussionState;

    @JsonProperty("discussion_open")
    private boolean discussionOpen;

    @JsonProperty("discussion_type")
    private String discussionType;

    @JsonProperty("first_post_id")
    private int firstPostId;

    @JsonProperty("last_post_date")
    private int lastPostDate;

    @JsonProperty("last_post_id")
    private int lastPostId;

    @JsonProperty("last_post_user_id")
    private int lastPostUserId;

    @JsonProperty("last_post_username")
    private String lastPostUsername;

    @JsonProperty("first_post_reaction_score")
    private int firstPostReactionScore;

    @JsonProperty("prefix_id")
    private int prefixId;

    @JsonProperty("User")
    private User user;

    public Thread() {
    }

    public Thread(String username, boolean isWatching, int visitorPostCount, GenericEntity customFields, String[] tags,
                  String prefix, boolean canEdit, boolean canEditTags, boolean canReply, boolean canSoftDelete,
                  boolean canHardDelete, boolean canViewAttachments, Node forum, int threadId, int nodeId, String title,
                  int replyCount, int viewCount, int userId, int postDate, boolean sticky, String discussionState,
                  boolean discussionOpen, String discussionType, int firstPostId, int lastPostDate, int lastPostId,
                  int lastPostUserId, String lastPostUsername, int firstPostReactionScore, int prefixId, User user) {
        this.username = username;
        this.isWatching = isWatching;
        this.visitorPostCount = visitorPostCount;
        this.customFields = customFields;
        this.tags = tags;
        this.prefix = prefix;
        this.canEdit = canEdit;
        this.canEditTags = canEditTags;
        this.canReply = canReply;
        this.canSoftDelete = canSoftDelete;
        this.canHardDelete = canHardDelete;
        this.canViewAttachments = canViewAttachments;
        this.forum = forum;
        this.threadId = threadId;
        this.nodeId = nodeId;
        this.title = title;
        this.replyCount = replyCount;
        this.viewCount = viewCount;
        this.userId = userId;
        this.postDate = postDate;
        this.sticky = sticky;
        this.discussionState = discussionState;
        this.discussionOpen = discussionOpen;
        this.discussionType = discussionType;
        this.firstPostId = firstPostId;
        this.lastPostDate = lastPostDate;
        this.lastPostId = lastPostId;
        this.lastPostUserId = lastPostUserId;
        this.lastPostUsername = lastPostUsername;
        this.firstPostReactionScore = firstPostReactionScore;
        this.prefixId = prefixId;
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isWatching() {
        return isWatching;
    }

    public void setWatching(boolean watching) {
        isWatching = watching;
    }

    public int getVisitorPostCount() {
        return visitorPostCount;
    }

    public void setVisitorPostCount(int visitorPostCount) {
        this.visitorPostCount = visitorPostCount;
    }

    public GenericEntity getCustomFields() {
        return customFields;
    }

    public void setCustomFields(GenericEntity customFields) {
        this.customFields = customFields;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanEditTags() {
        return canEditTags;
    }

    public void setCanEditTags(boolean canEditTags) {
        this.canEditTags = canEditTags;
    }

    public boolean isCanReply() {
        return canReply;
    }

    public void setCanReply(boolean canReply) {
        this.canReply = canReply;
    }

    public boolean isCanSoftDelete() {
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

    public boolean isCanViewAttachments() {
        return canViewAttachments;
    }

    public void setCanViewAttachments(boolean canViewAttachments) {
        this.canViewAttachments = canViewAttachments;
    }

    public Node getForum() {
        return forum;
    }

    public void setForum(Node forum) {
        this.forum = forum;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
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

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public String getDiscussionState() {
        return discussionState;
    }

    public void setDiscussionState(String discussionState) {
        this.discussionState = discussionState;
    }

    public boolean isDiscussionOpen() {
        return discussionOpen;
    }

    public void setDiscussionOpen(boolean discussionOpen) {
        this.discussionOpen = discussionOpen;
    }

    public String getDiscussionType() {
        return discussionType;
    }

    public void setDiscussionType(String discussionType) {
        this.discussionType = discussionType;
    }

    public int getFirstPostId() {
        return firstPostId;
    }

    public void setFirstPostId(int firstPostId) {
        this.firstPostId = firstPostId;
    }

    public int getLastPostDate() {
        return lastPostDate;
    }

    public void setLastPostDate(int lastPostDate) {
        this.lastPostDate = lastPostDate;
    }

    public int getLastPostId() {
        return lastPostId;
    }

    public void setLastPostId(int lastPostId) {
        this.lastPostId = lastPostId;
    }

    public int getLastPostUserId() {
        return lastPostUserId;
    }

    public void setLastPostUserId(int lastPostUserId) {
        this.lastPostUserId = lastPostUserId;
    }

    public String getLastPostUsername() {
        return lastPostUsername;
    }

    public void setLastPostUsername(String lastPostUsername) {
        this.lastPostUsername = lastPostUsername;
    }

    public int getFirstPostReactionScore() {
        return firstPostReactionScore;
    }

    public void setFirstPostReactionScore(int firstPostReactionScore) {
        this.firstPostReactionScore = firstPostReactionScore;
    }

    public int getPrefixId() {
        return prefixId;
    }

    public void setPrefixId(int prefixId) {
        this.prefixId = prefixId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

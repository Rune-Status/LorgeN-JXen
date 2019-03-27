package org.tanberg.jxen.entity.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.generic.GenericEntity;

public class User {

    @JsonProperty("about")
    private String about;

    @JsonProperty("activity_visible")
    private boolean activityVisible;

    @JsonProperty("age")
    private int age;

    @JsonProperty("alert_optout")
    private boolean[] alertOptout; // Unconfirmed data type, simply marked as "array" in docs

    @JsonProperty("allow_post_profile")
    private String allowPostProfile;

    @JsonProperty("allow_receive_news_feed")
    private String allowReceiveNewsFeed;

    @JsonProperty("allow_send_personal_conversation")
    private String allowSendPersonalConversation;

    @JsonProperty("allow_view_identities")
    private String allowViewIdentities;

    @JsonProperty("allow_view_profile")
    private String allowViewProfile;

    @JsonProperty("avatar_urls")
    private GenericEntity avatarUrls; // Unconfirmed type

    @JsonProperty("can_ban")
    private boolean canBan;

    @JsonProperty("can_converse")
    private boolean canConverse;

    @JsonProperty("can_edit")
    private boolean canEdit;

    @JsonProperty("can_follow")
    private boolean canFollow;

    @JsonProperty("can_ignore")
    private boolean canIgnore;

    @JsonProperty("can_post_profile")
    private boolean canPostProfile;

    @JsonProperty("can_view_profile")
    private boolean canViewProfile;

    @JsonProperty("can_view_profile_posts")
    private boolean canViewProfilePosts;

    @JsonProperty("can_warn")
    private boolean canWarn;

    @JsonProperty("content_show_signature")
    private boolean contentShowSignature;

    @JsonProperty("creation_watch_state")
    private String creationWatchState;

    @JsonProperty("custom_fields")
    private GenericEntity customFields;

    @JsonProperty("custom_title")
    private String customTitle;

    @JsonProperty("dob")
    private GenericEntity dateOfBirth;

    @JsonProperty("email")
    private String email;

    @JsonProperty("email_on_conversation")
    private boolean emailOnConversation;

    @JsonProperty("gravatar")
    private String gravatar;

    @JsonProperty("interaction_watch_state")
    private boolean interactionWatchState;

    @JsonProperty("is_admin")
    private boolean isAdmin;

    @JsonProperty("is_banned")
    private boolean isBanned;

    @JsonProperty("is_discouraged")
    private boolean isDiscouraged;

    @JsonProperty("is_followed")
    private boolean isFollowed;

    @JsonProperty("is_ignored")
    private boolean isIgnored;

    @JsonProperty("is_moderator")
    private boolean isModerator;

    @JsonProperty("is_super_admin")
    private boolean isSuperAdmin;

    @JsonProperty("last_activity")
    private int lastActivity;

    @JsonProperty("location")
    private String location;

    @JsonProperty("push_on_conversation")
    private boolean pushOnConversation;

    @JsonProperty("push_optout")
    private boolean[] pushOptout;

    @JsonProperty("receive_admin_email")
    private boolean receiveAdminEmail;

    @JsonProperty("secondary_group_ids")
    private int[] secondaryGroupIds;

    @JsonProperty("show_dob_date")
    private boolean showDobDate;

    @JsonProperty("show_dob_year")
    private boolean showDobYear;

    @JsonProperty("signature")
    private String signature;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("use_tfa")
    private boolean[] use2fa; // Unconfirmed

    @JsonProperty("user_group_id")
    private int userGroupId;

    @JsonProperty("user_state")
    private String userState;

    @JsonProperty("user_title")
    private String userTitle;

    @JsonProperty("visible")
    private boolean visible;

    @JsonProperty("warning_points")
    private int warningPoints;

    @JsonProperty("website")
    private String website;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("message_count")
    private int messageCount;

    @JsonProperty("register_date")
    private int registerDate;

    @JsonProperty("trophy_points")
    private int trophyPoints;

    @JsonProperty("is_staff")
    private boolean isStaff;

    @JsonProperty("reaction_score")
    private int reactionScore;

    public User() {
    }

    public User(String about, boolean activityVisible, int age, boolean[] alertOptout, String allowPostProfile,
                String allowReceiveNewsFeed, String allowSendPersonalConversation, String allowViewIdentities,
                String allowViewProfile, GenericEntity avatarUrls, boolean canBan, boolean canConverse, boolean canEdit,
                boolean canFollow, boolean canIgnore, boolean canPostProfile, boolean canViewProfile,
                boolean canViewProfilePosts, boolean canWarn, boolean contentShowSignature, String creationWatchState,
                GenericEntity customFields, String customTitle, GenericEntity dateOfBirth, String email,
                boolean emailOnConversation, String gravatar, boolean interactionWatchState, boolean isAdmin,
                boolean isBanned, boolean isDiscouraged, boolean isFollowed, boolean isIgnored, boolean isModerator,
                boolean isSuperAdmin, int lastActivity, String location, boolean pushOnConversation, boolean[] pushOptout,
                boolean receiveAdminEmail, int[] secondaryGroupIds, boolean showDobDate, boolean showDobYear,
                String signature, String timezone, boolean[] use2fa, int userGroupId, String userState,
                String userTitle, boolean visible, int warningPoints, String website, int userId, String username,
                int messageCount, int registerDate, int trophyPoints, boolean isStaff, int reactionScore) {
        this.about = about;
        this.activityVisible = activityVisible;
        this.age = age;
        this.alertOptout = alertOptout;
        this.allowPostProfile = allowPostProfile;
        this.allowReceiveNewsFeed = allowReceiveNewsFeed;
        this.allowSendPersonalConversation = allowSendPersonalConversation;
        this.allowViewIdentities = allowViewIdentities;
        this.allowViewProfile = allowViewProfile;
        this.avatarUrls = avatarUrls;
        this.canBan = canBan;
        this.canConverse = canConverse;
        this.canEdit = canEdit;
        this.canFollow = canFollow;
        this.canIgnore = canIgnore;
        this.canPostProfile = canPostProfile;
        this.canViewProfile = canViewProfile;
        this.canViewProfilePosts = canViewProfilePosts;
        this.canWarn = canWarn;
        this.contentShowSignature = contentShowSignature;
        this.creationWatchState = creationWatchState;
        this.customFields = customFields;
        this.customTitle = customTitle;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.emailOnConversation = emailOnConversation;
        this.gravatar = gravatar;
        this.interactionWatchState = interactionWatchState;
        this.isAdmin = isAdmin;
        this.isBanned = isBanned;
        this.isDiscouraged = isDiscouraged;
        this.isFollowed = isFollowed;
        this.isIgnored = isIgnored;
        this.isModerator = isModerator;
        this.isSuperAdmin = isSuperAdmin;
        this.lastActivity = lastActivity;
        this.location = location;
        this.pushOnConversation = pushOnConversation;
        this.pushOptout = pushOptout;
        this.receiveAdminEmail = receiveAdminEmail;
        this.secondaryGroupIds = secondaryGroupIds;
        this.showDobDate = showDobDate;
        this.showDobYear = showDobYear;
        this.signature = signature;
        this.timezone = timezone;
        this.use2fa = use2fa;
        this.userGroupId = userGroupId;
        this.userState = userState;
        this.userTitle = userTitle;
        this.visible = visible;
        this.warningPoints = warningPoints;
        this.website = website;
        this.userId = userId;
        this.username = username;
        this.messageCount = messageCount;
        this.registerDate = registerDate;
        this.trophyPoints = trophyPoints;
        this.isStaff = isStaff;
        this.reactionScore = reactionScore;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public boolean isActivityVisible() {
        return activityVisible;
    }

    public void setActivityVisible(boolean activityVisible) {
        this.activityVisible = activityVisible;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean[] getAlertOptout() {
        return alertOptout;
    }

    public void setAlertOptout(boolean[] alertOptout) {
        this.alertOptout = alertOptout;
    }

    public String getAllowPostProfile() {
        return allowPostProfile;
    }

    public void setAllowPostProfile(String allowPostProfile) {
        this.allowPostProfile = allowPostProfile;
    }

    public String getAllowReceiveNewsFeed() {
        return allowReceiveNewsFeed;
    }

    public void setAllowReceiveNewsFeed(String allowReceiveNewsFeed) {
        this.allowReceiveNewsFeed = allowReceiveNewsFeed;
    }

    public String getAllowSendPersonalConversation() {
        return allowSendPersonalConversation;
    }

    public void setAllowSendPersonalConversation(String allowSendPersonalConversation) {
        this.allowSendPersonalConversation = allowSendPersonalConversation;
    }

    public String getAllowViewIdentities() {
        return allowViewIdentities;
    }

    public void setAllowViewIdentities(String allowViewIdentities) {
        this.allowViewIdentities = allowViewIdentities;
    }

    public String getAllowViewProfile() {
        return allowViewProfile;
    }

    public void setAllowViewProfile(String allowViewProfile) {
        this.allowViewProfile = allowViewProfile;
    }

    public GenericEntity getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(GenericEntity avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public boolean isCanBan() {
        return canBan;
    }

    public void setCanBan(boolean canBan) {
        this.canBan = canBan;
    }

    public boolean isCanConverse() {
        return canConverse;
    }

    public void setCanConverse(boolean canConverse) {
        this.canConverse = canConverse;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanFollow() {
        return canFollow;
    }

    public void setCanFollow(boolean canFollow) {
        this.canFollow = canFollow;
    }

    public boolean isCanIgnore() {
        return canIgnore;
    }

    public void setCanIgnore(boolean canIgnore) {
        this.canIgnore = canIgnore;
    }

    public boolean isCanPostProfile() {
        return canPostProfile;
    }

    public void setCanPostProfile(boolean canPostProfile) {
        this.canPostProfile = canPostProfile;
    }

    public boolean isCanViewProfile() {
        return canViewProfile;
    }

    public void setCanViewProfile(boolean canViewProfile) {
        this.canViewProfile = canViewProfile;
    }

    public boolean isCanViewProfilePosts() {
        return canViewProfilePosts;
    }

    public void setCanViewProfilePosts(boolean canViewProfilePosts) {
        this.canViewProfilePosts = canViewProfilePosts;
    }

    public boolean isCanWarn() {
        return canWarn;
    }

    public void setCanWarn(boolean canWarn) {
        this.canWarn = canWarn;
    }

    public boolean isContentShowSignature() {
        return contentShowSignature;
    }

    public void setContentShowSignature(boolean contentShowSignature) {
        this.contentShowSignature = contentShowSignature;
    }

    public String getCreationWatchState() {
        return creationWatchState;
    }

    public void setCreationWatchState(String creationWatchState) {
        this.creationWatchState = creationWatchState;
    }

    public GenericEntity getCustomFields() {
        return customFields;
    }

    public void setCustomFields(GenericEntity customFields) {
        this.customFields = customFields;
    }

    public String getCustomTitle() {
        return customTitle;
    }

    public void setCustomTitle(String customTitle) {
        this.customTitle = customTitle;
    }

    public GenericEntity getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GenericEntity dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmailOnConversation() {
        return emailOnConversation;
    }

    public void setEmailOnConversation(boolean emailOnConversation) {
        this.emailOnConversation = emailOnConversation;
    }

    public String getGravatar() {
        return gravatar;
    }

    public void setGravatar(String gravatar) {
        this.gravatar = gravatar;
    }

    public boolean isInteractionWatchState() {
        return interactionWatchState;
    }

    public void setInteractionWatchState(boolean interactionWatchState) {
        this.interactionWatchState = interactionWatchState;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    public boolean isDiscouraged() {
        return isDiscouraged;
    }

    public void setDiscouraged(boolean discouraged) {
        isDiscouraged = discouraged;
    }

    public boolean isFollowed() {
        return isFollowed;
    }

    public void setFollowed(boolean followed) {
        isFollowed = followed;
    }

    public boolean isIgnored() {
        return isIgnored;
    }

    public void setIgnored(boolean ignored) {
        isIgnored = ignored;
    }

    public boolean isModerator() {
        return isModerator;
    }

    public void setModerator(boolean moderator) {
        isModerator = moderator;
    }

    public boolean isSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public int getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(int lastActivity) {
        this.lastActivity = lastActivity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPushOnConversation() {
        return pushOnConversation;
    }

    public void setPushOnConversation(boolean pushOnConversation) {
        this.pushOnConversation = pushOnConversation;
    }

    public boolean[] getPushOptout() {
        return pushOptout;
    }

    public void setPushOptout(boolean[] pushOptout) {
        this.pushOptout = pushOptout;
    }

    public boolean isReceiveAdminEmail() {
        return receiveAdminEmail;
    }

    public void setReceiveAdminEmail(boolean receiveAdminEmail) {
        this.receiveAdminEmail = receiveAdminEmail;
    }

    public int[] getSecondaryGroupIds() {
        return secondaryGroupIds;
    }

    public void setSecondaryGroupIds(int[] secondaryGroupIds) {
        this.secondaryGroupIds = secondaryGroupIds;
    }

    public boolean isShowDobDate() {
        return showDobDate;
    }

    public void setShowDobDate(boolean showDobDate) {
        this.showDobDate = showDobDate;
    }

    public boolean isShowDobYear() {
        return showDobYear;
    }

    public void setShowDobYear(boolean showDobYear) {
        this.showDobYear = showDobYear;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean[] getUse2fa() {
        return use2fa;
    }

    public void setUse2fa(boolean[] use2fa) {
        this.use2fa = use2fa;
    }

    public int getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(int userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getWarningPoints() {
        return warningPoints;
    }

    public void setWarningPoints(int warningPoints) {
        this.warningPoints = warningPoints;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public int getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(int registerDate) {
        this.registerDate = registerDate;
    }

    public int getTrophyPoints() {
        return trophyPoints;
    }

    public void setTrophyPoints(int trophyPoints) {
        this.trophyPoints = trophyPoints;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public void setStaff(boolean staff) {
        isStaff = staff;
    }

    public int getReactionScore() {
        return reactionScore;
    }

    public void setReactionScore(int reactionScore) {
        this.reactionScore = reactionScore;
    }
}

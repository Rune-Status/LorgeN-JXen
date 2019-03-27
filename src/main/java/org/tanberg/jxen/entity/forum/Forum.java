package org.tanberg.jxen.entity.forum;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Forum {

    @JsonProperty("allow_posting")
    private boolean allowPosting;

    @JsonProperty("allow_poll")
    private boolean allowPoll;

    @JsonProperty("require_prefix")
    private boolean requirePrefix;

    @JsonProperty("min_tags")
    private int minTags;

    public Forum() {
    }

    public Forum(boolean allowPosting, boolean allowPoll, boolean requirePrefix, int minTags) {
        this.allowPosting = allowPosting;
        this.allowPoll = allowPoll;
        this.requirePrefix = requirePrefix;
        this.minTags = minTags;
    }

    public boolean isAllowPosting() {
        return allowPosting;
    }

    public void setAllowPosting(boolean allowPosting) {
        this.allowPosting = allowPosting;
    }

    public boolean isAllowPoll() {
        return allowPoll;
    }

    public void setAllowPoll(boolean allowPoll) {
        this.allowPoll = allowPoll;
    }

    public boolean isRequirePrefix() {
        return requirePrefix;
    }

    public void setRequirePrefix(boolean requirePrefix) {
        this.requirePrefix = requirePrefix;
    }

    public int getMinTags() {
        return minTags;
    }

    public void setMinTags(int minTags) {
        this.minTags = minTags;
    }
}

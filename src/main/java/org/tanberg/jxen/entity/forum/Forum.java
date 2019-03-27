package org.tanberg.jxen.entity.forum;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

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

    @JsonGetter("allow_posting")
    public boolean isAllowPosting() {
        return allowPosting;
    }

    @JsonSetter("allow_posting")
    public void setAllowPosting(boolean allowPosting) {
        this.allowPosting = allowPosting;
    }

    @JsonGetter("allow_poll")
    public boolean isAllowPoll() {
        return allowPoll;
    }

    @JsonSetter("allow_poll")
    public void setAllowPoll(boolean allowPoll) {
        this.allowPoll = allowPoll;
    }

    @JsonGetter("require_prefix")
    public boolean isRequirePrefix() {
        return requirePrefix;
    }

    @JsonSetter("require_prefix")
    public void setRequirePrefix(boolean requirePrefix) {
        this.requirePrefix = requirePrefix;
    }

    @JsonGetter("min_tags")
    public int getMinTags() {
        return minTags;
    }

    @JsonSetter("min_tags")
    public void setMinTags(int minTags) {
        this.minTags = minTags;
    }
}

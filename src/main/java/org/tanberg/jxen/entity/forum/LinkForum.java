package org.tanberg.jxen.entity.forum;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LinkForum {

    @JsonProperty("link_url")
    private String linkUrl;

    @JsonProperty("redirect_count")
    private int redirectCount;

    public LinkForum() {
    }

    public LinkForum(String linkUrl, int redirectCount) {
        this.linkUrl = linkUrl;
        this.redirectCount = redirectCount;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public int getRedirectCount() {
        return redirectCount;
    }

    public void setRedirectCount(int redirectCount) {
        this.redirectCount = redirectCount;
    }
}

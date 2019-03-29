package org.tanberg.jxen.entity.forum;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Page {

    @JsonProperty("publish_date")
    private int publishDate;

    @JsonProperty("view_count")
    private int viewCount;

    public Page() {
    }

    public Page(int publishDate, int viewCount) {
        this.publishDate = publishDate;
        this.viewCount = viewCount;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public int getViewCount() {
        return viewCount;
    }
}

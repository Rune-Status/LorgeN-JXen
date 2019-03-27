package org.tanberg.jxen.entity.forum.thread;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreadPrefix {

    @JsonProperty("prefix_id")
    private int prefixId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("is_usable")
    private boolean isUsable;

    @JsonProperty("prefix_group_id")
    private int prefixGroupId;

    @JsonProperty("display_order")
    private int displayOrder;

    @JsonProperty("materialized_order")
    private int materializedOrder;

    public ThreadPrefix() {
    }

    public ThreadPrefix(int prefixId, String title, boolean isUsable, int prefixGroupId, int displayOrder, int materializedOrder) {
        this.prefixId = prefixId;
        this.title = title;
        this.isUsable = isUsable;
        this.prefixGroupId = prefixGroupId;
        this.displayOrder = displayOrder;
        this.materializedOrder = materializedOrder;
    }

    public int getPrefixId() {
        return prefixId;
    }

    public void setPrefixId(int prefixId) {
        this.prefixId = prefixId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUsable() {
        return isUsable;
    }

    public void setUsable(boolean usable) {
        isUsable = usable;
    }

    public int getPrefixGroupId() {
        return prefixGroupId;
    }

    public void setPrefixGroupId(int prefixGroupId) {
        this.prefixGroupId = prefixGroupId;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public int getMaterializedOrder() {
        return materializedOrder;
    }

    public void setMaterializedOrder(int materializedOrder) {
        this.materializedOrder = materializedOrder;
    }
}

package org.tanberg.jxen.entity.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.tanberg.jxen.entity.generic.GenericEntity;

public class UserField {

    @JsonProperty("field_id")
    private String fieldId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("display_order")
    private int displayOrder;

    @JsonProperty("field_type")
    private String fieldType;

    @JsonProperty("field_choices")
    private GenericEntity fieldChoices;

    @JsonProperty("match_type")
    private String matchType;

    @JsonProperty("match_params")
    private String[] matchParams; // Need to verify this

    @JsonProperty("max_length")
    private int maxLength;

    @JsonProperty("required")
    private boolean required;

    @JsonProperty("display_group")
    private String displayGroup;

    public UserField() {
    }

    public UserField(String fieldId, String title, String description, int displayOrder, String fieldType,
                     GenericEntity fieldChoices, String matchType, String[] matchParams, int maxLength, boolean required, String displayGroup) {
        this.fieldId = fieldId;
        this.title = title;
        this.description = description;
        this.displayOrder = displayOrder;
        this.fieldType = fieldType;
        this.fieldChoices = fieldChoices;
        this.matchType = matchType;
        this.matchParams = matchParams;
        this.maxLength = maxLength;
        this.required = required;
        this.displayGroup = displayGroup;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public GenericEntity getFieldChoices() {
        return fieldChoices;
    }

    public void setFieldChoices(GenericEntity fieldChoices) {
        this.fieldChoices = fieldChoices;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String[] getMatchParams() {
        return matchParams;
    }

    public void setMatchParams(String[] matchParams) {
        this.matchParams = matchParams;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getDisplayGroup() {
        return displayGroup;
    }

    public void setDisplayGroup(String displayGroup) {
        this.displayGroup = displayGroup;
    }
}

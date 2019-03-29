package org.tanberg.jxen.entity.attachment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attachment {

    @JsonProperty("filename")
    private String filename;

    @JsonProperty("file_size")
    private int fileSize;

    @JsonProperty("height")
    private int height;

    @JsonProperty("width")
    private int width;

    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

    @JsonProperty("video_url")
    private String videoUrl;

    @JsonProperty("attachment_id")
    private int attachmentId;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("content_id")
    private int contentId;

    @JsonProperty("attach_date")
    private int attachDate;

    @JsonProperty("view_count")
    private int viewCount;

    public Attachment() {
    }

    public Attachment(String filename, int fileSize, int height, int width, String thumbnailUrl, String videoUrl,
                      int attachmentId, String contentType, int contentId, int attachDate, int viewCount) {
        this.filename = filename;
        this.fileSize = fileSize;
        this.height = height;
        this.width = width;
        this.thumbnailUrl = thumbnailUrl;
        this.videoUrl = videoUrl;
        this.attachmentId = attachmentId;
        this.contentType = contentType;
        this.contentId = contentId;
        this.attachDate = attachDate;
        this.viewCount = viewCount;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public int getAttachDate() {
        return attachDate;
    }

    public void setAttachDate(int attachDate) {
        this.attachDate = attachDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}

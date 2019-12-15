package org.szh.beans;

public class VideoInfo {
    private String markId;

    private String descriptionTitle;

    private String descriptionContent;

    private String videoUrl;

    public String getMarkId() {
        return markId;
    }

    public void setMarkId(String markId) {
        this.markId = markId == null ? null : markId.trim();
    }

    public String getDescriptionTitle() {
        return descriptionTitle;
    }

    public void setDescriptionTitle(String descriptionTitle) {
        this.descriptionTitle = descriptionTitle == null ? null : descriptionTitle.trim();
    }

    public String getDescriptionContent() {
        return descriptionContent;
    }

    public void setDescriptionContent(String descriptionContent) {
        this.descriptionContent = descriptionContent == null ? null : descriptionContent.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }
}
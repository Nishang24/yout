package com.example.yout;

public class Video {
    private String id;
    private String title;
    private String thumbnailUrl;
    private String videoUrl;
    private String channelName;
    private String views;
    private String uploadedDate;

    public Video(String id, String title, String thumbnailUrl, String videoUrl, String channelName, String views, String uploadedDate) {
        this.id = id;
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
        this.videoUrl = videoUrl;
        this.channelName = channelName;
        this.views = views;
        this.uploadedDate = uploadedDate;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getThumbnailUrl() { return thumbnailUrl; }
    public String getVideoUrl() { return videoUrl; }
    public String getChannelName() { return channelName; }
    public String getViews() { return views; }
    public String getUploadedDate() { return uploadedDate; }
}
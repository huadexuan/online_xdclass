package net.xdclass.online_xdclass.domain;

import java.util.Date;

public class Episode {

    private int id;

    private String title;

    private int num;

    private int ordered;

    private String playUrl;

    private int chapterId;

    private int free;

    private int videoId;

    private Date createTime;

    public Episode() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getOrdered() {
        return ordered;
    }

    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "episode{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", num=" + num +
                ", ordered=" + ordered +
                ", playUrl='" + playUrl + '\'' +
                ", chapterId=" + chapterId +
                ", free=" + free +
                ", videoId=" + videoId +
                ", createTime=" + createTime +
                '}';
    }
}

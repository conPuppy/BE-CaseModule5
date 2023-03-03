package com.becasestudymodule5.dto;

public class FullPost {
    private String username;
    private String img;
    private String content;
    private String datetime;
    private String status;

    public FullPost(String username, String img, String content, String datetime, String status) {
        this.username = username;
        this.img = img;
        this.content = content;
        this.datetime = datetime;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

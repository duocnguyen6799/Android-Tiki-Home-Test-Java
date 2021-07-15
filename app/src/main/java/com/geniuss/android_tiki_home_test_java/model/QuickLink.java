package com.geniuss.android_tiki_home_test_java.model;

public class QuickLink {
    public String title;
    public String content;
    public String url;
    public boolean authentication;
    public String web_url;
    public String image_url;

    public QuickLink(String title, String content, String url, boolean authentication, String web_url, String image_url) {
        this.title = title;
        this.content = content;
        this.url = url;
        this.authentication = authentication;
        this.web_url = web_url;
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "QuickLink{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", authentication=" + authentication +
                ", web_url='" + web_url + '\'' +
                ", image_url='" + image_url + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isAuthentication() {
        return authentication;
    }

    public void setAuthentication(boolean authentication) {
        this.authentication = authentication;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}

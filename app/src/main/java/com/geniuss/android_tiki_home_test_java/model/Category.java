package com.geniuss.android_tiki_home_test_java.model;

public class Category {
    public int id;
    public String query_value;
    public String name;
    public String thumbnail_url;

    public Category(int id, String query_value, String name, String thumbnail_url) {
        this.id = id;
        this.query_value = query_value;
        this.name = name;
        this.thumbnail_url = thumbnail_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuery_value() {
        return query_value;
    }

    public void setQuery_value(String query_value) {
        this.query_value = query_value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }
}

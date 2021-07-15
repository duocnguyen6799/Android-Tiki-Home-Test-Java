package com.geniuss.android_tiki_home_test_java.model;

public class Tab {
    public int query_value;
    public String from_date;
    public String to_date;
    public String display;
    public boolean active;

    public Tab(int query_value, String from_date, String to_date, String display, boolean active) {
        this.query_value = query_value;
        this.from_date = from_date;
        this.to_date = to_date;
        this.display = display;
        this.active = active;
    }

    public int getQuery_value() {
        return query_value;
    }

    public void setQuery_value(int query_value) {
        this.query_value = query_value;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

package com.geniuss.android_tiki_home_test_java.model;

public class ProgressDeal {
    public int qty;
    public int qty_ordered;
    public int qty_remain;
    public int percent;
    public String status;
    public String progress_text;

    public ProgressDeal(int qty, int qty_ordered, int qty_remain, int percent, String status, String progress_text) {
        this.qty = qty;
        this.qty_ordered = qty_ordered;
        this.qty_remain = qty_remain;
        this.percent = percent;
        this.status = status;
        this.progress_text = progress_text;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty_ordered() {
        return qty_ordered;
    }

    public void setQty_ordered(int qty_ordered) {
        this.qty_ordered = qty_ordered;
    }

    public int getQty_remain() {
        return qty_remain;
    }

    public void setQty_remain(int qty_remain) {
        this.qty_remain = qty_remain;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProgress_text() {
        return progress_text;
    }

    public void setProgress_text(String progress_text) {
        this.progress_text = progress_text;
    }
}

package com.geniuss.android_tiki_home_test_java.model;

public class DataDeal {
    public int deal_id;
    public String deal_status;
    public int deal_version;
    public int status;
    public String url;
    public String tags;
    public int discount_percent;
    public int special_price;
    public int special_from_date;
    public String from_date;
    public int special_to_date;
    public ProgressDeal progress;
    public Product product;

    public DataDeal() {
    }

    public int getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(int deal_id) {
        this.deal_id = deal_id;
    }

    public String getDeal_status() {
        return deal_status;
    }

    public void setDeal_status(String deal_status) {
        this.deal_status = deal_status;
    }

    public int getDeal_version() {
        return deal_version;
    }

    public void setDeal_version(int deal_version) {
        this.deal_version = deal_version;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(int discount_percent) {
        this.discount_percent = discount_percent;
    }

    public int getSpecial_price() {
        return special_price;
    }

    public void setSpecial_price(int special_price) {
        this.special_price = special_price;
    }

    public int getSpecial_from_date() {
        return special_from_date;
    }

    public void setSpecial_from_date(int special_from_date) {
        this.special_from_date = special_from_date;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public int getSpecial_to_date() {
        return special_to_date;
    }

    public void setSpecial_to_date(int special_to_date) {
        this.special_to_date = special_to_date;
    }

    public ProgressDeal getProgress() {
        return progress;
    }

    public void setProgress(ProgressDeal progress) {
        this.progress = progress;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "DataDeal{" +
                "deal_id=" + deal_id +
                ", deal_status='" + deal_status + '\'' +
                ", deal_version=" + deal_version +
                ", status=" + status +
                ", url='" + url + '\'' +
                ", tags='" + tags + '\'' +
                ", discount_percent=" + discount_percent +
                ", special_price=" + special_price +
                ", special_from_date=" + special_from_date +
                ", from_date='" + from_date + '\'' +
                ", special_to_date=" + special_to_date +
                ", progress=" + progress +
                ", product=" + product +
                '}';
    }
}

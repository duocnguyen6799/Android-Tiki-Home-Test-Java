package com.geniuss.android_tiki_home_test_java.model;

import java.util.List;

public class Product {
    public int id;
    public Object sku;
    public String name;
    public String url_path;
    public int price;
    public int list_price;
    public List<Badge> badges;
    public int discount;
    public int rating_average;
    public int review_count;
    public int order_count;
    public String thumbnail_url;
    public boolean is_visible;
    public boolean is_fresh;
    public boolean is_flower;
    public boolean is_gift_card;
    public Inventory inventory;
    public String url_attendant_input_form;
    public int master_id;
    public int seller_product_id;
    public String price_prefix;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getSku() {
        return sku;
    }

    public void setSku(Object sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl_path() {
        return url_path;
    }

    public void setUrl_path(String url_path) {
        this.url_path = url_path;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getList_price() {
        return list_price;
    }

    public void setList_price(int list_price) {
        this.list_price = list_price;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getRating_average() {
        return rating_average;
    }

    public void setRating_average(int rating_average) {
        this.rating_average = rating_average;
    }

    public int getReview_count() {
        return review_count;
    }

    public void setReview_count(int review_count) {
        this.review_count = review_count;
    }

    public int getOrder_count() {
        return order_count;
    }

    public void setOrder_count(int order_count) {
        this.order_count = order_count;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public boolean isIs_visible() {
        return is_visible;
    }

    public void setIs_visible(boolean is_visible) {
        this.is_visible = is_visible;
    }

    public boolean isIs_fresh() {
        return is_fresh;
    }

    public void setIs_fresh(boolean is_fresh) {
        this.is_fresh = is_fresh;
    }

    public boolean isIs_flower() {
        return is_flower;
    }

    public void setIs_flower(boolean is_flower) {
        this.is_flower = is_flower;
    }

    public boolean isIs_gift_card() {
        return is_gift_card;
    }

    public void setIs_gift_card(boolean is_gift_card) {
        this.is_gift_card = is_gift_card;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getUrl_attendant_input_form() {
        return url_attendant_input_form;
    }

    public void setUrl_attendant_input_form(String url_attendant_input_form) {
        this.url_attendant_input_form = url_attendant_input_form;
    }

    public int getMaster_id() {
        return master_id;
    }

    public void setMaster_id(int master_id) {
        this.master_id = master_id;
    }

    public int getSeller_product_id() {
        return seller_product_id;
    }

    public void setSeller_product_id(int seller_product_id) {
        this.seller_product_id = seller_product_id;
    }

    public String getPrice_prefix() {
        return price_prefix;
    }

    public void setPrice_prefix(String price_prefix) {
        this.price_prefix = price_prefix;
    }
}

package com.geniuss.android_tiki_home_test_java.model.respone;

import com.geniuss.android_tiki_home_test_java.model.Category;
import com.geniuss.android_tiki_home_test_java.model.DataDeal;
import com.geniuss.android_tiki_home_test_java.model.Tab;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DealsRespone {
    @SerializedName("data")
    public List<DataDeal> deals;
    public List<Category> categories;
    public List<Tab> tabs;
    public String version;
}

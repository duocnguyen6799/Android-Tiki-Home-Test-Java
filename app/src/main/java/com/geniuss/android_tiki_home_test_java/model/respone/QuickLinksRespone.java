package com.geniuss.android_tiki_home_test_java.model.respone;

import com.geniuss.android_tiki_home_test_java.model.Banner;
import com.geniuss.android_tiki_home_test_java.model.QuickLink;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuickLinksRespone {
    @SerializedName("data")
    public List<List<QuickLink>> quickLinks;
}

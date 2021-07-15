package com.geniuss.android_tiki_home_test_java.model.respone;

import com.geniuss.android_tiki_home_test_java.model.Banner;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BannersRespone {
    @SerializedName("data")
    public List<Banner> banners;
}

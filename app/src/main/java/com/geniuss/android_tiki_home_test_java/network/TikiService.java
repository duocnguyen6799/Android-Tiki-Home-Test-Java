package com.geniuss.android_tiki_home_test_java.network;

import com.geniuss.android_tiki_home_test_java.model.respone.BannersRespone;
import com.geniuss.android_tiki_home_test_java.model.respone.DealsRespone;
import com.geniuss.android_tiki_home_test_java.model.respone.QuickLinksRespone;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import static com.geniuss.android_tiki_home_test_java.Constant.BASE_URL;

public interface TikiService {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    TikiService tikiService = retrofit.create(TikiService.class);

    @GET("v2/home/banners/v2")
    Call<BannersRespone> getListBanner();

    @GET("shopping/v2/widgets/quick_link")
    Call<QuickLinksRespone> getListQuickLink();

    @GET("v2/widget/deals/hot")
    Call<DealsRespone> getListDeal();
}

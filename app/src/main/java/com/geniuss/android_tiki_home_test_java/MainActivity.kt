package com.geniuss.android_tiki_home_test_java

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.geniuss.android_tiki_home_test_java.model.respone.BannersRespone
import com.geniuss.android_tiki_home_test_java.model.respone.DealsRespone
import com.geniuss.android_tiki_home_test_java.model.respone.QuickLinksRespone
import com.geniuss.android_tiki_home_test_java.network.TikiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var tikiService:TikiService
    lateinit var btnClick: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tikiService = TikiService.tikiService
        btnClick = findViewById(R.id.btnClick)
    }
    public fun getDataFromAPI(view: View) {
        /*tikiService.listBanner.enqueue(object : Callback<BannersRespone> {
            override fun onResponse(
                call: Call<BannersRespone>,
                response: Response<BannersRespone>
            ) {
                if (response != null) {
                    Toast.makeText(this@MainActivity, "Success!", Toast.LENGTH_SHORT).show()
                    Log.e(MainActivity::class.java.toString(), response.body()!!.banners[0].toString())
                }
            }

            override fun onFailure(call: Call<BannersRespone>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error!", Toast.LENGTH_SHORT).show()
            }
        })*/

        /*tikiService.listQuickLink.enqueue(object : Callback<QuickLinksRespone> {
            override fun onResponse(
                call: Call<QuickLinksRespone>,
                response: Response<QuickLinksRespone>
            ) {
                Log.e(MainActivity::class.java.toString(), response.body()!!.quickLinks[0][0].toString())
            }

            override fun onFailure(call: Call<QuickLinksRespone>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error!", Toast.LENGTH_SHORT).show()
            }

        })*/

        tikiService.listDeal.enqueue(object : Callback<DealsRespone> {
            override fun onResponse(
                call: Call<DealsRespone>,
                response: Response<DealsRespone>
            ) {
                Log.e(MainActivity::class.java.toString(), response.body()!!.deals[0].toString())
            }

            override fun onFailure(call: Call<DealsRespone>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error!", Toast.LENGTH_SHORT).show()
            }

        })
    }
}


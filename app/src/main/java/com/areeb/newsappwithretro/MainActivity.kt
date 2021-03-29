package com.areeb.newsappwithretro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.areeb.newsappwithretro.Model.Article
import com.areeb.newsappwithretro.Model.Response
import com.areeb.newsappwithretro.Retrofit.Common
import com.areeb.newsappwithretro.Retrofit.Reterofit_Service
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback


class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: NewsAdapter
    lateinit var mService :Reterofit_Service
    lateinit var layoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //recyclerView=findViewById(R.id.news_recycler)

        mService=Common.reterofitService

        news_recycler.setHasFixedSize(true)
        layoutManager= LinearLayoutManager(this)
        news_recycler.layoutManager=layoutManager

        getAllNews()






    }

    private fun getAllNews() {
        mService.getNews().enqueue(object : Callback<Response>{
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                val newsList = response.body()!!.articles
                mAdapter=NewsAdapter(newsList)
                news_recycler.adapter= mAdapter

            }

            override fun onFailure(call: Call<Response>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })
    }


}
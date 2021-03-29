package com.areeb.newsappwithretro.Retrofit

import com.areeb.newsappwithretro.Model.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Reterofit_Service {
    @GET("v2/top-headlines")
    fun getNews(@Query("country") countryCode: String = "in",
                @Query("apiKey") apiKey: String = "21fc137255d647f2aa6515a0b284d6fd") : Call<Response>

}
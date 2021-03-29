package com.areeb.newsappwithretro.Retrofit

object Common {

    private val BASE_URL ="https://newsapi.org/"

    val reterofitService:Reterofit_Service
    get() = RetrofitClient.getClient(BASE_URL).create(Reterofit_Service::class.java)

}
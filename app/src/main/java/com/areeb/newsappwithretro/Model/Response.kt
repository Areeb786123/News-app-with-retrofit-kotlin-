package com.areeb.newsappwithretro.Model

data class Response (
    var articles: List<Article>,
    val status: String,
    val totalResults: Int
        )
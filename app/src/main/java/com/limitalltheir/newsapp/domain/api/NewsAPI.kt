package com.limitalltheir.newsapp.domain.api

import com.limitalltheir.newsapp.domain.dto.NewsDto
import com.limitalltheir.newsapp.common.util.Constans
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Constans.API_KEY
    ): Response<NewsDto>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Constans.API_KEY
    ): Response<NewsDto>
}
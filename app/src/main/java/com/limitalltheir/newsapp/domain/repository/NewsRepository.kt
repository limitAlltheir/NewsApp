package com.limitalltheir.newsapp.domain.repository

import com.limitalltheir.newsapp.domain.api.RetrofitInstance
import com.limitalltheir.newsapp.domain.db.ArticleDatabase
import com.limitalltheir.newsapp.domain.dto.Article

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun  getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()
}
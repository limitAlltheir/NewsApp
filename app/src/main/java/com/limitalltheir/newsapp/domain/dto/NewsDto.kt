package com.limitalltheir.newsapp.domain.dto


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NewsDto(
    @SerializedName("articles")
    val articles: MutableList<Article>?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResults: Int?
)

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    //@SerializedName("author")
    val author: String?,
    //@SerializedName("content")
    val content: String?,
    //@SerializedName("description")
    val description: String?,
    //@SerializedName("publishedAt")
    val publishedAt: String?,
    //@SerializedName("source")
    val source: Source?,
    //@SerializedName("title")
    val title: String?,
    //@SerializedName("url")
    val url: String?,
    //@SerializedName("urlToImage")
    val urlToImage: String?
) : Serializable

data class Source(
    //@SerializedName("id")
    val id: String?,
    //@SerializedName("name")
    val name: String?
)
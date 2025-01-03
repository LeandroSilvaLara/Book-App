package com.plcoding.bookpedia.book.data

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val description: String,
    val imageUrl: String?,
    val language: List<String>,
    val firstPublishYear: String?,
    val averageRating: Double?,
    val ratingsCount: Int?,
    val numPages: Int?,
    val numEditions: Int?,

)

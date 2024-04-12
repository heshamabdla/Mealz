package com.app.data.remote

import com.app.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals(): CategoryResponse
}
package com.app.data.repo

import com.app.data.remote.ApiService
import com.app.domain.entity.CategoryResponse
import com.app.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService): MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}
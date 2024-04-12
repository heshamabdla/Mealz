package com.app.domain.repo

import com.app.domain.entity.CategoryResponse

interface MealsRepo {
   suspend fun getMealsFromRemote(): CategoryResponse
}
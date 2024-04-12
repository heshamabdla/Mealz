package com.app.domain.usecase

import com.app.domain.repo.MealsRepo

class GetMealz(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}

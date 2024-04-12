package com.app.mealz.di

import com.app.data.remote.ApiService
import com.app.data.repo.MealsRepoImpl
import com.app.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo{
        return MealsRepoImpl(apiService)
    }
}
package com.github.fajaragungpramana.worksomething.di

import com.github.fajaragungpramana.worksomething.repository.FakeRepository
import com.github.fajaragungpramana.worksomething.viewmodel.FakeViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun fakeRepository() = FakeRepository()

    @Provides
    fun fakeViewModel(fakeRepository: FakeRepository) = FakeViewModel(fakeRepository)

}
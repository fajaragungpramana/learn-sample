package com.github.fajaragungpramana.worksomething.viewmodel

import com.github.fajaragungpramana.worksomething.repository.FakeRepository

class FakeViewModel(private val mFakeRepository: FakeRepository) {

    fun getPersonAndCar() = mFakeRepository.getPersonAndCar()

}
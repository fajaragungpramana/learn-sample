package com.github.fajaragungpramana.worksomething.viewmodel

import com.github.fajaragungpramana.worksomething.repository.FakeRepository
import javax.inject.Inject

class FakeViewModel @Inject constructor(private val mFakeRepository: FakeRepository) {

    fun getPersonAndCar() = mFakeRepository.getPersonAndCar()

}
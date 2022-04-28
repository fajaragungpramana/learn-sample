package com.github.fajaragungpramana.worksomething.repository

import com.github.fajaragungpramana.worksomething.remote.FakeRemoteDataSource

class FakeRepository {

    fun getPersonAndCar(): String {
        val person = FakeRemoteDataSource.getPerson()
        val car = FakeRemoteDataSource.getCar()

        return "${person.name} Umur ${person.age} Punya mobil ${car.brand} ${car.type}"
    }

}
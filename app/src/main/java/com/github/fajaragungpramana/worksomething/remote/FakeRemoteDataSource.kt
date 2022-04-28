package com.github.fajaragungpramana.worksomething.remote

import com.github.fajaragungpramana.worksomething.entity.Car
import com.github.fajaragungpramana.worksomething.entity.Person

object FakeRemoteDataSource {

    fun getPerson() = Person(name = "Gilang", age = 10)

    fun getCar() = Car(brand = "Toyota", type = "Innova")

    fun getListPerson() = arrayListOf<Person>().apply {
        add(Person(name = "Daniel", age = 5))
        add(Person(name = "Agung", age = 6))
        add(Person(name = "Ucok", age = 5))
        add(Person(name = "Rahma", age = 9))
        add(Person(name = "Intan", age = 10))
    }

    fun getListCar() = arrayListOf<Car>().apply {
        add(Car(brand = "Toyota", type = "Fortuner"))
        add(Car(brand = "Hyundai", type = "Creta"))
        add(Car(brand = "Suzuki", type = "Ertiga"))
        add(Car(brand = "Honda", type = "Civic"))
        add(Car(brand = "Daihatsu", type = "Xenia"))
    }

}
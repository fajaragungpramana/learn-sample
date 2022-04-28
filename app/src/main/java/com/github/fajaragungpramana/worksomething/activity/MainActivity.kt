package com.github.fajaragungpramana.worksomething.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.fajaragungpramana.worksomething.R
import com.github.fajaragungpramana.worksomething.repository.FakeRepository
import com.github.fajaragungpramana.worksomething.viewmodel.FakeViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mViewModel: FakeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = FakeViewModel(FakeRepository())
        Log.d("FF", mViewModel.getPersonAndCar())

    }

}
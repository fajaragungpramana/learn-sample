package com.github.fajaragungpramana.worksomething.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.fajaragungpramana.worksomething.databinding.ActivityMainBinding
import com.github.fajaragungpramana.worksomething.repository.FakeRepository
import com.github.fajaragungpramana.worksomething.viewmodel.FakeViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mViewModel: FakeViewModel

    private lateinit var mViewBinding: ActivityMainBinding
    val binding: ActivityMainBinding
        get() = mViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mViewModel = FakeViewModel(FakeRepository())

        binding.tvGreeting.text = mViewModel.getPersonAndCar()

    }

}
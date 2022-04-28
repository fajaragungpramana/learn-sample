package com.github.fajaragungpramana.worksomething.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.fajaragungpramana.worksomething.databinding.ActivityMainBinding
import com.github.fajaragungpramana.worksomething.viewmodel.FakeViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mViewModel: FakeViewModel

    private lateinit var mViewBinding: ActivityMainBinding
    val binding: ActivityMainBinding
        get() = mViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvGreeting.text = mViewModel.getPersonAndCar()

    }

}
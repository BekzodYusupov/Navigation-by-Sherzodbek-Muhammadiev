package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.R
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.SplashViewModel
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.impl.SplashViewModelImpl

@AndroidEntryPoint
class SplashScreen:Fragment(R.layout.screen_splash) {
    private val viewModel:SplashViewModel by viewModels<SplashViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.openMain()
    }
}
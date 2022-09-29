package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation.Navigator
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.screens.SplashScreenDirections
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.SplashViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModelImpl @Inject constructor(
    private val navigator: Navigator
) : SplashViewModel, ViewModel() {

    override fun openMain() {
        viewModelScope.launch {
            delay(2000)
            navigator.navigateTo(SplashScreenDirections.actionSplashScreenToMainScreen())
        }
    }
}
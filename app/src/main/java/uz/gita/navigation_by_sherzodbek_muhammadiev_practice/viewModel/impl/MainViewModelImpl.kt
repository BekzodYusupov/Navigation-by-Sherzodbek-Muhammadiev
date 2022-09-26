package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation.Navigator
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.screens.MainScreenDirections
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.MainViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModelImpl @Inject constructor(
    private val navigator: Navigator
) : MainViewModel, ViewModel() {

    override fun openAdd() {
        viewModelScope.launch { navigator.navigateTo(MainScreenDirections.actionMainScreenToAddScreen()) }
    }
}
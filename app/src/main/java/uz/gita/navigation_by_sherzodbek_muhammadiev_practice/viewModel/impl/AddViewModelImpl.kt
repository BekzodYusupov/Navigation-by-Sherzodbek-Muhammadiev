package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation.Navigator
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.screens.AddScreenDirections
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.AddViewModel
import javax.inject.Inject

@HiltViewModel
class AddViewModelImpl @Inject constructor(
    private val navigator: Navigator
) : AddViewModel, ViewModel() {

    override fun openAbout() {
        viewModelScope.launch { navigator.navigateTo(AddScreenDirections.actionAddScreenToAboutScreen()) }
    }
}
package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation.Navigator
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.AboutViewModel
import javax.inject.Inject

@HiltViewModel
class AboutViewModelImpl @Inject constructor(
    private val navigator: Navigator
): AboutViewModel, ViewModel() {
    override fun back() {
        viewModelScope.launch{ navigator.back()}
    }
}
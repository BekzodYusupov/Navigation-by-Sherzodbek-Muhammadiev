package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.screens

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.R
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.MainViewModel
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.impl.MainViewModelImpl

@AndroidEntryPoint
class MainScreen : Fragment(R.layout.screen_main) {
    private val viewModel: MainViewModel by viewModels<MainViewModelImpl>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.btnAdd).setOnClickListener {
            Toast.makeText(requireContext(), "Add clicked", Toast.LENGTH_SHORT).show()
            viewModel.openAdd()
        }
    }
}
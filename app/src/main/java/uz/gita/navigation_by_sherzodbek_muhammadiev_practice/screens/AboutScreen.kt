package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.screens

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.R
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.AboutViewModel
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.impl.AboutViewModelImpl

@AndroidEntryPoint
class AboutScreen:Fragment(R.layout.screen_about) {
    private val viewModel: AboutViewModel by viewModels<AboutViewModelImpl>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        view.findViewById<Button>(R.id.btnBack).setOnClickListener {
            viewModel.back()
        }
    }
}
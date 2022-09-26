package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.screens

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.R
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.AddViewModel
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.viewModel.impl.AddViewModelImpl

@AndroidEntryPoint
class AddScreen:Fragment(R.layout.screen_add) {
    private val viewModel: AddViewModel by viewModels<AddViewModelImpl>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        view.findViewById<Button>(R.id.btnAdd2).setOnClickListener {
            viewModel.openAbout()
        }
    }
}
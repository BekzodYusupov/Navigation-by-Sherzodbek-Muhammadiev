package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation

import androidx.navigation.NavController
import kotlinx.coroutines.flow.Flow

interface Handler {
    val navigationStack: Flow<NavController.() -> Unit>
}
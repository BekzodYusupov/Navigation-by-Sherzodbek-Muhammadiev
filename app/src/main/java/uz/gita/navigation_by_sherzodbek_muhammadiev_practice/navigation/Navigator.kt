package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation

import androidx.navigation.NavDirections

interface Navigator {
    suspend fun navigateTo(direction: NavDirections)
    suspend fun back()
}
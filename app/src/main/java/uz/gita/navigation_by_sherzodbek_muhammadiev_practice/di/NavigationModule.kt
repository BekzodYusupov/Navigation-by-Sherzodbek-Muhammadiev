package uz.gita.navigation_by_sherzodbek_muhammadiev_practice.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation.Handler
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation.NavigationDispatcher
import uz.gita.navigation_by_sherzodbek_muhammadiev_practice.navigation.Navigator

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @Binds
    fun bindsNavigator(impl: NavigationDispatcher): Navigator

    @Binds
    fun bindsHandler(impl: NavigationDispatcher): Handler
}
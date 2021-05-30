package com.example.android.hilt.di

import com.example.android.hilt.ui.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(FragmentComponent::class)
@Module
abstract class MainModule {
//    @FragmentScoped
//    @Binds
//    abstract fun bindMainViewModel(viewModel: MainViewModel): MainViewModel
}
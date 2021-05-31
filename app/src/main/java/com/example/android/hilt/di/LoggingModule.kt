package com.example.android.hilt.di

import androidx.fragment.app.FragmentActivity
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.data.LoggerInMemoryDataSource
import com.example.android.hilt.data.LoggerLocalDataSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
annotation class InMemoryLogger

@Qualifier
annotation class DatabaseLogger

@InstallIn(SingletonComponent::class)
@Module
abstract class LoggingDatabaseModule {
    @DatabaseLogger
    @Singleton
    @Binds
    abstract fun bindDatabaseLogger(impl: LoggerLocalDataSource): LoggerDataSource
}

@InstallIn(ActivityComponent::class)
@Module
class LoggingInMemoryModule {
    @InMemoryLogger
    @ActivityScoped
    @Provides
    fun provideInMemoryLogger(impl: LoggerInMemoryDataSource): LoggerDataSource {
        return LoggerInMemoryDataSource()
    }
}

@InstallIn(ViewModelComponent::class)
@Module
abstract class LogginIntMemoriVMModule {
    @InMemoryLogger
    @ViewModelScoped
    @Binds
    abstract fun bindInMemoryLogger(impl: LoggerInMemoryDataSource): LoggerDataSource
}

@InstallIn(FragmentComponent::class)
@Module
class FragmentModule {
    @FragmentScoped
    @Provides
    fun provideFragment(activity: FragmentActivity): FragmentActivity {
        return activity
    }
}
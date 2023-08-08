package io.amntoppo.stepstracker.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.amntoppo.stepstracker.database.StepsDAO
import io.amntoppo.stepstracker.database.StepsDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): StepsDatabase =
        Room.databaseBuilder(app, StepsDatabase::class.java, "steps_db")
            .build()

    @Provides
    @Singleton
    fun provideStepsDao(db: StepsDatabase): StepsDAO =
        db.getStepsDao()
}
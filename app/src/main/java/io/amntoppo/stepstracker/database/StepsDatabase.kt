package io.amntoppo.stepstracker.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import io.amntoppo.stepstracker.utils.Converter

@Database(
    entities = [Steps::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class StepsDatabase: RoomDatabase() {
    abstract fun getStepsDao(): StepsDAO
}
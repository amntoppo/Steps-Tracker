package io.amntoppo.stepstracker.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface StepsDAO {

    @Insert(onConflict = REPLACE)
    suspend fun insertSteps(steps: Steps)

    @Delete
    fun deleteSteps(steps: Steps)

    @Query("SELECT * FROM Steps WHERE id LIKE '%' || :id || '%'")
    fun getSteps(id: Int): Steps

    @Query("SELECT * FROM Steps ORDER BY timeStamp DESC")
    fun getStepsSortedByDate(): LiveData<List<Steps>>

    @Query("SELECT * FROM Steps ORDER BY timeInMillis DESC")
    fun getStepsSortedByTimeInMillis(): LiveData<List<Steps>>

    @Query("SELECT * FROM Steps ORDER BY averageSpeed DESC")
    fun getStepsSortedByAverageSpeed(): LiveData<List<Steps>>

    @Query("SELECT * FROM Steps ORDER BY distance DESC")
    fun getStepsSortedByDistance(): LiveData<List<Steps>>

    @Query("SELECT * FROM Steps ORDER BY caloriesBurnt DESC")
    fun getStepsSortedByCaloriesBurnt(): LiveData<List<Steps>>

    @Query("SELECT SUM(timeInMillis) FROM Steps")
    fun getTotalRunningTime(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurnt) FROM Steps")
    fun getTotalCaloriesBurnt(): LiveData<Int>

    @Query("SELECT AVG(averageSpeed) from Steps")
    fun getAverageSpeed(): LiveData<Float>

    @Query("SELECT SUM(distance) FROM Steps")
    fun getTotalDistance(): LiveData<Int>
}
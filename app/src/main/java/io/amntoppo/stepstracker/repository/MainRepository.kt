package io.amntoppo.stepstracker.repository

import io.amntoppo.stepstracker.database.Steps
import io.amntoppo.stepstracker.database.StepsDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val stepsDao: StepsDAO
) {

    suspend fun insertSteps(steps: Steps) {
        stepsDao.insertSteps(steps)
    }
    suspend fun deleteSteps(steps: Steps) {
        stepsDao.deleteSteps(steps)
    }

    fun getStepsSortedByDate() = stepsDao.getStepsSortedByDate()
    fun getStepsSortedByDistance() = stepsDao.getStepsSortedByDistance()
    fun getStepsSortedByTimeInMillis() = stepsDao.getStepsSortedByTimeInMillis()
    fun getStepsSortedByAverageSpeed() = stepsDao.getStepsSortedByAverageSpeed()
    fun getStepsSortedByCaloriesBurnt() = stepsDao.getStepsSortedByCaloriesBurnt()
    fun getAverageSpeed() = stepsDao.getAverageSpeed()
    fun getTotalCaloriesBurnt() = stepsDao.getTotalCaloriesBurnt()
    fun getTotalDistance() = stepsDao.getTotalDistance()
    fun getTotalTimeInMillis() = stepsDao.getTotalTimeInMillis()
}
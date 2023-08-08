package io.amntoppo.stepstracker.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Steps")
data class Steps(
    var img: Bitmap? = null,
    var timeStamp: Long = 0L,
    var averageSpeed: Float = 0F,
    var distance: Int = 0,
    var timeInMillis: Long = 0L,
    var caloriesBurnt: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}

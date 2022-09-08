package com.innaval.fitnesstracker.model

import androidx.room.TypeConverter


object DateConverter {

    @TypeConverter
    fun toDate(dateLong: Long?) : java.util.Date? {
        return if (dateLong != null) java.util.Date(dateLong) else null
    }

    @TypeConverter
    fun fromDate(date: java.util.Date?): Long? {
        return date?.time
    }

}
package com.limitalltheir.newsapp.domain.db

import androidx.room.TypeConverter
import com.limitalltheir.newsapp.domain.dto.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) = source.name

    @TypeConverter
    fun toSource(name: String) = Source(name, name)
}
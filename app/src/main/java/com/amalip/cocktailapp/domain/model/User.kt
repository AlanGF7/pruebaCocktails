package com.amalip.cocktailapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
class User {
    @PrimaryKey(autoGenerate = true)
    val idUser: Int = 0,
    @Json(name = "strName") val nameUser: String = "",
    @Json(name = "strEmail") val email: String = "",
    @Json(name = "strImage") val imageUser: String = "",
    @Json(name = "strToken") val token: String = ""

}
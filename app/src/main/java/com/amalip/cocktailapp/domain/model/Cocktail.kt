package com.amalip.cocktailapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by Amalip on 9/29/2021.
 */

@Entity
@JsonClass(generateAdapter = true)
class Cocktail(
    @PrimaryKey(autoGenerate = false)
    val idDrink: Int = 0,
    @Json(name = "strDrink") val name: String = "",
    @Json(name = "strCategory") val category: String = "",
    @Json(name = "strDrinkThumb") val urlThumb: String = "",
    @Json(name = "strImageSource") val url: String? = "",
    //Propiedad agregada
    @Json(name = "strAlcoholic") val alcoholic: String? = "",
    //Propiedad de práctica
    @Json(name = "strInstructions") val instructions: String? = ""
) {

    val urlDetail: String
    get() = url ?: urlThumb //Si la url llega nula, entonces usará la urlThumb
}
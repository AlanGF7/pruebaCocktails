package com.amalip.cocktailapp.framework.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.amalip.cocktailapp.data.dao.CocktailDao
import com.amalip.cocktailapp.domain.model.Cocktail
import com.amalip.cocktailapp.domain.model.User

/**
 * Created by Amalip on 10/5/2021.
 */

//Necesario para usar "Room"

//Especificamos las tablas, la versión y las entidades.

//Cualquier cambio que se haga en la base de datos debe de ser respaldada por una versión 2 o posterior

//

@Database(entities = [Cocktail::class , User::class], version = 4)
abstract class CocktailDb : RoomDatabase() {

    abstract fun cocktailDao(): CocktailDao

}

//Manejador de la base de datos
package com.amalip.cocktailapp.core.di

import android.content.Context
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.amalip.cocktailapp.framework.db.CocktailDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Amalip on 10/5/2021.
 */

@Module //Le especificamos que será un módulo
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    //Propiedad para poder realizar una migración
    private val MIGRATION_2_3 = object : Migration(2, 3) {
        override fun migrate(database: SupportSQLiteDatabase) {
            //Estamos alterando la tabla, agregando un campo nuevo
            database.execSQL("ALTER TABLE Cocktail ADD COLUMN instructions TEXT")
            //Versión 1 a 2 exitosa
        }
    }

    @Provides
    @Singleton
    fun provideCocktailDb(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, CocktailDb::class.java, "cocktails").addMigrations(
            MIGRATION_2_3
        ).build()

}
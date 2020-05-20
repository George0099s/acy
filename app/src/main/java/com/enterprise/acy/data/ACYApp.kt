package com.enterprise.acy.data

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.enterprise.acy.data.db.AppDatabase
import com.enterprise.acy.presentation.utils.Constants
import java.net.Socket
import java.net.URI
import java.net.URISyntaxException

class ACYApp: Application() {

        private lateinit var sharedPreferences: SharedPreferences
            private set
//        private var component: UserComponent? = null

        override fun onCreate() {
            super.onCreate()
            instance = this
            sharedPreferences =
                getSharedPreferences(Constants.MY_PREFERENCES, Context.MODE_PRIVATE)
            database = Room.databaseBuilder(this, AppDatabase::class.java, Constants.DB_NAME)
                .build()
//            component = DaggerUserComponent
//                .builder()
//                .userModule(UserModule())
//                .build()

        }


        companion object {
            lateinit var instance: ACYApp
            lateinit var database: AppDatabase
        }

        init {
            try {

            } catch (e: URISyntaxException) {
                throw RuntimeException(e)
            }
        }
    }
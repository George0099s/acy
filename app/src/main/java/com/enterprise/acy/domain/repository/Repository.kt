package com.enterprise.acy.domain.repository

import androidx.lifecycle.LiveData
import com.enterprise.acy.data.ACYApp
import com.enterprise.acy.data.db.AppDatabase
import com.enterprise.acy.data.db.ObjectEntity
import com.enterprise.acy.data.db.manager.DbManager

class Repository {
//    private lateinit var dbManager: DbManager
    private var db: AppDatabase = ACYApp.database

//    private fun getAllObjects(): LiveData<List<ObjectEntity>> {
//        return dbManager.getAllObjects()
//    }

    fun getAllObjects(): LiveData<List<ObjectEntity>> {
        return db.objectsDao.getAllObjectsLiveData()
    }
}
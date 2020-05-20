package com.enterprise.acy.data.db.manager

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import com.enterprise.acy.data.ACYApp
import com.enterprise.acy.data.db.AppDatabase
import com.enterprise.acy.data.db.ObjectEntity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

class DbManager {
    private val app = ACYApp.instance

    private lateinit var db: AppDatabase


//        @SuppressLint("CheckResult")
//        fun getAllDbTaskById(
//            callback: TaskDbCallback?,
//            assignee: String?
//        ) {
//            db.objectsDao.getAllObjects()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(callback::onTasksLoaded as Consumer<in MutableList<TaskEntity?>?>?)
//        }

}
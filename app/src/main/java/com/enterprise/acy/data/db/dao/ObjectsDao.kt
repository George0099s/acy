package com.enterprise.acy.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.enterprise.acy.data.db.MaterialEntity
import com.enterprise.acy.data.db.ObjectEntity
import io.reactivex.Maybe

@Dao
interface ObjectsDao {
    @Query("SELECT * FROM `objects`")
    fun getAllObjects(): Maybe<List<ObjectEntity>>
    @Query("SELECT * FROM `objects`")
    fun getAllObjectsLiveData(): LiveData<List<ObjectEntity>>

//    @Query("SELECT * FROM `Actual duration` WHERE createdBy = :assignee AND date = :date")
//    fun getAllDurationByAssigneeDate(
//        assignee: String?,
//        date: String?
//    ): Maybe<List<ActualDurationEntity?>?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(ObjectEntityList: List<ObjectEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(ObjectEntity: ObjectEntity)

    @Delete
    fun delete(ObjectEntity: ObjectEntity)

    @Query("DELETE FROM `objects`")
    fun deleteAll()
}
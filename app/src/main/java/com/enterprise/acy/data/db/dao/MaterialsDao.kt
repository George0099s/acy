package com.enterprise.acy.data.db.dao

import androidx.room.*
import com.enterprise.acy.data.db.MaterialEntity
import io.reactivex.Maybe

@Dao
interface  MaterialsDao {
    @Query("SELECT * FROM `materials`")
     fun getAllMaterials(): Maybe<List<MaterialEntity>>

//    @Query("SELECT * FROM `Actual duration` WHERE createdBy = :assignee AND date = :date")
//    fun getAllDurationByAssigneeDate(
//        assignee: String?,
//        date: String?
//    ): Maybe<List<ActualDurationEntity?>?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(materialEntityList: List<MaterialEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(materialEntity: MaterialEntity)

    @Update
    fun update(materialEntity: MaterialEntity)

    @Delete
    fun delete(materialEntity: MaterialEntity)

    @Query("DELETE FROM `materials`")
    fun deleteAll()
}
package com.enterprise.acy.data.db

import androidx.room.*
import com.enterprise.acy.data.db.dao.MaterialsDao
import com.enterprise.acy.data.db.dao.ObjectsDao

@Entity(tableName = "objects")
data class ObjectEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "name") var objectName: String,
    @ColumnInfo(name = "city") var city: String,
    @ColumnInfo(name = "phone") var phone: Int,
    @ColumnInfo(name = "address") var address: String
)
@Entity(tableName = "materials")
data class MaterialEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "name") var objectName: String,
    @ColumnInfo(name = "price") var city: Double,
    @ColumnInfo(name = "count") var phone: Int,
    @ColumnInfo(name = "type") var type: String
    )

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "name") var objectName: String,
    @ColumnInfo(name = "type") var type: String
    )


@Database(entities = [ObjectEntity::class, MaterialEntity::class, UserEntity::class],version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract val materialsDao: MaterialsDao
    abstract val objectsDao: ObjectsDao
}
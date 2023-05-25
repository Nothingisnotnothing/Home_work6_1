package kg.vohkysan.home_work6_1.data.storage.db

import androidx.room.Database
import androidx.room.RoomDatabase
import kg.vohkysan.home_work6_1.data.storage.models.WordData

@Database(entities = [WordData::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun wordDao(): WordDao
}
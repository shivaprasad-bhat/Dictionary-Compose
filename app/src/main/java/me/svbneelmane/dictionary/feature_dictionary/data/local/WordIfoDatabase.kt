package me.svbneelmane.dictionary.feature_dictionary.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import me.svbneelmane.dictionary.feature_dictionary.data.local.entity.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 1
)
abstract class WordIfoDatabase : RoomDatabase() {
    abstract val dao: WordInfoDao
}
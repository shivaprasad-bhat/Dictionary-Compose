package me.svbneelmane.dictionary.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import me.svbneelmane.dictionary.feature_dictionary.domain.model.License
import me.svbneelmane.dictionary.feature_dictionary.domain.model.Meaning
import me.svbneelmane.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val sourceUrls: List<String>,
    val word: String,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo() = WordInfo(
        license = license,
        meanings = meanings,
        phonetic = phonetic,
        sourceUrls = sourceUrls,
        word = word
    )
}

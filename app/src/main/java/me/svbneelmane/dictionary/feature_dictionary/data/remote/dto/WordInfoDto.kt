package me.svbneelmane.dictionary.feature_dictionary.data.remote.dto

data class WordInfoDto(
    val license: License,
    val meaningDtos: List<MeaningDto>,
    val phonetic: String,
    val phoneticDtos: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
)
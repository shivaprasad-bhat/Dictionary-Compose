package me.svbneelmane.dictionary.feature_dictionary.domain.model

import me.svbneelmane.dictionary.feature_dictionary.data.remote.dto.LicenseDto

data class WordInfo(
    val license: License,
    val meaningDtos: List<Meaning>,
    val phonetic: String,
    val sourceUrls: List<String>,
    val word: String
)

package me.svbneelmane.dictionary.feature_dictionary.domain.model

import me.svbneelmane.dictionary.feature_dictionary.data.remote.dto.LicenseDto

data class Phonetic(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
)

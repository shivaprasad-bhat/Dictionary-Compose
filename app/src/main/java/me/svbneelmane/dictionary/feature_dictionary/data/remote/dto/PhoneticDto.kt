package me.svbneelmane.dictionary.feature_dictionary.data.remote.dto

import me.svbneelmane.dictionary.feature_dictionary.domain.model.Phonetic

data class PhoneticDto(
    val audio: String,
    val licenseDto: LicenseDto,
    val sourceUrl: String,
    val text: String
) {
    fun toPhonetic() = Phonetic(
        audio = audio,
        license = licenseDto.toLicense(),
        sourceUrl = sourceUrl,
        text = text
    )
}
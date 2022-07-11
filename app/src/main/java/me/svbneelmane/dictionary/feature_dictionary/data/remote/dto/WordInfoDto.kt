package me.svbneelmane.dictionary.feature_dictionary.data.remote.dto

import me.svbneelmane.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val licenseDto: LicenseDto,
    val meaningDtos: List<MeaningDto>,
    val phonetic: String,
    val phoneticDtos: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meaningDtos = meaningDtos.map { it.toMeaning() },
            license = licenseDto.toLicense(),
            phonetic = phonetic,
            sourceUrls = sourceUrls,
            word = word
        )
    }
}
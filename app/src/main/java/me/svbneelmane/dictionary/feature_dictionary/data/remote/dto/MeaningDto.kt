package me.svbneelmane.dictionary.feature_dictionary.data.remote.dto

import me.svbneelmane.dictionary.feature_dictionary.domain.model.Meaning

data class MeaningDto(
    val antonyms: List<String>,
    val definitionDtos: List<DefinitionDto>,
    val partOfSpeech: String,
    val synonyms: List<String>
) {
    fun toMeaning() = Meaning(
        definition = definitionDtos.map { it.toDefinition() },
        antonyms = antonyms,
        partOfSpeech = partOfSpeech,
        synonyms = synonyms
    )
}
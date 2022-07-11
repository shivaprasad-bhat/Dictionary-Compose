package me.svbneelmane.dictionary.feature_dictionary.data.remote.dto

data class MeaningDto(
    val antonyms: List<String>,
    val definitionDtos: List<DefinitionDto>,
    val partOfSpeech: String,
    val synonyms: List<String>
)
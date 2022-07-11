package me.svbneelmane.dictionary.feature_dictionary.domain.model

import me.svbneelmane.dictionary.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val antonyms: List<String>,
    val definition: List<Definition>,
    val partOfSpeech: String,
    val synonyms: List<String>
)

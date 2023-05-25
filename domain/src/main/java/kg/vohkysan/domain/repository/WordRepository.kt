package kg.vohkysan.domain.repository

import kg.vohkysan.domain.models.WordDomain

interface WordRepository {

    fun saveWord(wordDomain: WordDomain)
    fun getWord() : WordDomain?
    fun deleteAllWords()
}
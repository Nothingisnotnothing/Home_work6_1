package kg.vohkysan.home_work6_1.data.repository

import kg.vohkysan.domain.models.WordDomain
import kg.vohkysan.domain.repository.WordRepository
import kg.vohkysan.home_work6_1.data.storage.db.AppDataBase
import kg.vohkysan.home_work6_1.data.storage.models.WordData

class WordRepositoryImpl(private val appDataBase: AppDataBase) : WordRepository {
    override fun saveWord(wordDomain: WordDomain) {
        val wordData = mapToStorage(wordDomain)
        appDataBase.wordDao().addWord(wordData)
    }

    override fun getWord(): WordDomain? {
        val wordData = appDataBase.wordDao().getWord()
        return mapToDomain(wordData)
    }

    override fun deleteAllWords() {
        appDataBase.wordDao().deleteAll()
    }

    private fun mapToStorage(wordDomain: WordDomain): WordData {
        return WordData(name = wordDomain.name)
    }

    private fun mapToDomain(wordData: WordData): WordDomain? {
        return wordData.name?.let { WordDomain(it) }
    }
}
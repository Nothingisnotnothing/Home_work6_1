package kg.vohkysan.domain.usecase

import kg.vohkysan.domain.models.WordDomain
import kg.vohkysan.domain.repository.WordRepository

class GetWordUseCase(private val wordRepository: WordRepository) {

    fun execute(): WordDomain? {
        return wordRepository.getWord()
    }
}
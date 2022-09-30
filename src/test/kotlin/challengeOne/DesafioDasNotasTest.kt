package challengeOne

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

@Suppress("UnusedEquals")
internal class DesafioDasNotasTest {

    val isListFourNotes = compareNotes(arrayOf(1,2,3,4), arrayOf(4,3,2,1))
    val isNotListFourNotes = compareNotes(arrayOf(1,2,3), arrayOf(3,2,1))

    @Test
    fun `Quando não há quatro notas, retorna mensagem de erro!`(){
        val expectedResult = "Erro! Por favor, insira 4 notas."

        isNotListFourNotes == expectedResult
    }

    @Test
    fun `Quando há quatro notas, retorna o resultado com sucesso!`(){
        val expectedResult = "[2,2]"

        isListFourNotes == expectedResult
    }
}
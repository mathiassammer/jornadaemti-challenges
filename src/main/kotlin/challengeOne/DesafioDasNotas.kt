package challengeOne

fun compareNotes(a: Array<Int>, b: Array<Int>): String {
    if (!isListFourNotes(a, b)) return "Erro! Por favor, insira 4 notas."

    var pointsEarnedMaria: Int = 0
    var pointsEarnedJoao: Int = 0
    for (i in 0..3) {
        if (a[i] > b[i]) ++ pointsEarnedMaria
        else if (a[i] < b[i]) ++ pointsEarnedJoao
    }

    return arrayOf(pointsEarnedMaria, pointsEarnedJoao).contentToString()
}

private fun isListFourNotes(a: Array<Int>, b: Array<Int>): Boolean = a.size == 4 && b.size == 4
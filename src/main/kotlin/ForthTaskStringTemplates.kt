fun numberName(inputNumber: Int) {

    val rangeInput = 1..1000

    val onesDigit = arrayOf(
        "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"
    )
    val specialDigit = arrayOf(
        "", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
        "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    )
    val tensDigit = arrayOf(
        "", "", "двадцать ", "тридцать ", "сорок ", "пятьдесят ",
        "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "
    )
    val hundredsDigit = arrayOf(
        "", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ",
        "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "
    )

    if (inputNumber !in rangeInput) {
        println("Введены некорректные данные!")
        return
    }

    if (inputNumber == 1000) {
        println("одна тысяча")
        return
    }

    val digitsNumber = countDigits(inputNumber)

    val outputWord = hundredsDigit[digitsNumber[0]] + specialDigit[digitsNumber[1]] +
            tensDigit[digitsNumber[2]] + onesDigit[digitsNumber[3]]

    print(outputWord.trim())
}


private fun countDigits(inputNumber: Int): List<Int> {

    var number = inputNumber

    val digitsNumber = mutableListOf<Int>()

    digitsNumber.add(number / 100)
    number %= 100

    if (number in 10..19) {
        digitsNumber.addAll(listOf(number % 10 + 1, 0, 0))
        return digitsNumber
    }

    digitsNumber.addAll(listOf(0, number / 10, number % 10))
    return digitsNumber
}

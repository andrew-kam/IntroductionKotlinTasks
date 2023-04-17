//fun numberName() {
fun main() {

    val rangeInput = 1..1000

    val ones = arrayOf(
        "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"
    )
    val special = arrayOf(
        "", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
        "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    )
    val tens = arrayOf(
        "", "", "двадцать ", "тридцать ", "сорок ", "пятьдесят ",
        "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "
    )
    val hundreds = arrayOf(
        "", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ",
        "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "
    )
    val thousands = arrayOf(
        "", "одна тысяча "
    )

    val inputNumber = inputIntNumber(rangeInput)

    if (inputNumber !in rangeInput) {
        println("Введены некорректные данные, работа программы завершена!")
        return
    }

    val digitsNumber = countDigits(inputNumber)

    val outputWord = thousands[digitsNumber[0]] + hundreds[digitsNumber[1]] +
            special[digitsNumber[2]] + tens[digitsNumber[3]] + ones[digitsNumber[4]]

    print(outputWord.trim())
}

private fun inputIntNumber(rangeNumber: IntRange): Int {

    println("Введите целое число в диапазоне [$rangeNumber]:")

    return readlnOrNull()?.toIntOrNull() ?: 0
}

private fun countDigits(inputNumber: Int): List<Int>{

    var number = inputNumber

    val digitsNumber = mutableListOf<Int>()

    digitsNumber.add(number / 1000)
    number %= 1000
    digitsNumber.add(number / 100)
    number %= 100

    if (number in 10..19) {
        digitsNumber.add(number % 10 + 1)
        digitsNumber.add(0)
        digitsNumber.add(0)
        return digitsNumber
    }
    digitsNumber.add(0)
    digitsNumber.add(number / 10)
    digitsNumber.add(number % 10)
    return digitsNumber
}

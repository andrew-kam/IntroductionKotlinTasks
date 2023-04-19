private val RANGE_INPUT = 1..1000

private val ONE_DIGIT = listOf(
    "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"
)
private val TEN_DIGIT = listOf(
    "", "", "двадцать ", "тридцать ", "сорок ", "пятьдесят ",
    "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто ",
    "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
    "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
)
private val HUNDRED_DIGIT = listOf(
    "", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ",
    "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "
)

private const val DIVISOR_ONE_HUNDRED = 100
private const val DIVISOR_TEN = 10
private val DOUBLE_FIGURE_RANGE = 10..19

private fun countDigits(inputNumber: Int): List<Int> {

    var inputFigure = inputNumber

    val digitsNumber = mutableListOf(0, 0, 0)

    digitsNumber[0] = inputFigure / DIVISOR_ONE_HUNDRED
    inputFigure %= DIVISOR_ONE_HUNDRED

    if (inputFigure in DOUBLE_FIGURE_RANGE) {
        digitsNumber[1] = inputFigure
        return digitsNumber
    }

    digitsNumber[1] = inputFigure / DIVISOR_TEN
    digitsNumber[2] = inputFigure % DIVISOR_TEN

    return digitsNumber
}

fun numberName(inputNumber: Int) {

    if (inputNumber !in RANGE_INPUT) {
        println("Введены некорректные данные!")
        return
    }

    if (inputNumber == RANGE_INPUT.last) {
        println("одна тысяча")
        return
    }

    val digitsNumber = countDigits(inputNumber)

    val outputWord = HUNDRED_DIGIT[digitsNumber[0]] + TEN_DIGIT[digitsNumber[1]] + ONE_DIGIT[digitsNumber[2]]

    print(outputWord.trim())
}

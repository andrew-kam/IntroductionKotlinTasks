import java.time.LocalDate
import java.time.Month
import java.util.logging.Handler


fun typeSelection(inputObject: Any?) {

    when (inputObject) {

        is String -> {
            println("Я получил String = '$inputObject', ее длина равна ${inputObject.length}")
        }

        is Int -> {
            println("Я получил Int = $inputObject, его квадрат равен ${inputObject * inputObject}")
        }

        is Double -> {
            println("Я получил Double = $inputObject, это число округляется до ${
                    "%.2f".format(inputObject).replace(Regex("\\.?0*$"), "")
                }")
        }

        is LocalDate -> {
            val tinkoffFoundationDate = LocalDate.of(2006, Month.DECEMBER, 24)
            println("Я получил LocalData = $inputObject," +
                    " эта дата ${if (inputObject < tinkoffFoundationDate) "меньше"
                    else "больше или равна"} чем дата основания Tinkoff")
        }

        null -> {
            println("Объект равен null")
        }

        else -> {
            println("Мне этот тип неизвестен")
        }
    }
}

fun main() {
    typeSelection("Privet")
    typeSelection(145)
    typeSelection(145.0)
    typeSelection(145.2817812)
    typeSelection(LocalDate.of(1990,1,1))
    typeSelection(LocalDate.of(2006,12,24))
    typeSelection(Handler::class)
}

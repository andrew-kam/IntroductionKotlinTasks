import java.time.LocalDate
import java.time.Month
import java.util.logging.Handler

fun typeCasting(obj: Any?) {
    when (obj) {
        is String -> {
            println("Я получил String = '$obj', ее длина равна ${obj.length}")
        }
        is Int -> {
            println("Я получил Int = $obj, его квадрат равен ${obj * obj}")
        }
        is Double -> {
            println("Я получил Double = $obj, это число округляется до ${
                    "%.2f".format(obj).replace(Regex("\\.?0*$"), "")
                }")
        }
        is LocalDate -> {
            val tinkoffFoundationDate = LocalDate.of(2006, Month.DECEMBER, 24)
            val comparisonResult = obj.isBefore(tinkoffFoundationDate)
            println("Я получил LocalData = $obj," +
                    " эта дата ${if (comparisonResult) "меньше" else "больше или равна"} чем дата основания Tinkoff")
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
    typeCasting("Privet")
    typeCasting(145)
    typeCasting(145.0)
    typeCasting(145.2817812)
    typeCasting(LocalDate.of(1990,1,1))
    typeCasting(Handler::class)
}
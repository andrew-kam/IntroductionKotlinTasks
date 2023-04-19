import java.time.LocalDate
import java.time.Month


private val TINKOFF_FOUNDATION_DATE = LocalDate.of(2006, Month.DECEMBER, 24)

fun typeSelection(inputObject: Any?) {

    when (inputObject) {

        is String ->
            println("Я получил String = '$inputObject', ее длина равна ${inputObject.length}")

        is Int ->
            println("Я получил Int = $inputObject, его квадрат равен ${inputObject * inputObject}")

        is Double ->
            println(
                "Я получил Double = $inputObject, это число округляется до ${
                    "%.2f".format(inputObject).replace(Regex("\\.?0*$"), "")
                }"
            )

        is LocalDate ->
            println(
                "Я получил LocalData = $inputObject," +
                        " эта дата ${
                            if (inputObject < TINKOFF_FOUNDATION_DATE) "меньше"
                            else "больше или равна"
                        } чем дата основания Tinkoff"
            )

        null ->
            println("Объект равен null")

        else ->
            println("Мне этот тип неизвестен")
    }
}

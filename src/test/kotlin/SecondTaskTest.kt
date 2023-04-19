import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.time.LocalDate
import java.util.logging.Handler
import java.util.stream.Stream
import kotlin.test.assertEquals


class SecondTaskTest {

    companion object {
        @JvmStatic
        private fun typeSelectionProvider(): Stream<Arguments> =
            Stream.of(
                Arguments.of("Privet!", "Я получил String = 'Privet!', ее длина равна 7"),
                Arguments.of(234, "Я получил Int = 234, его квадрат равен 54756"),
                Arguments.of(223.3943572, "Я получил Double = 223.3943572, это число округляется до 223.39"),
                Arguments.of(731.0, "Я получил Double = 731.0, это число округляется до 731"),
                Arguments.of(
                    LocalDate.of(2006, 12, 23),
                    "Я получил LocalData = 2006-12-23, эта дата меньше чем дата основания Tinkoff"
                ),
                Arguments.of(
                    LocalDate.of(2006, 12, 24),
                    "Я получил LocalData = 2006-12-24, эта дата больше или равна чем дата основания Tinkoff"
                ),
                Arguments.of(
                    LocalDate.of(2006, 12, 25),
                    "Я получил LocalData = 2006-12-25, эта дата больше или равна чем дата основания Tinkoff"
                ),
                Arguments.of(null, "Объект равен null"),
                Arguments.of(Handler::class, "Мне этот тип неизвестен")
            )
    }

    @ParameterizedTest
    @MethodSource("typeSelectionProvider")
    fun testTypeSelection(inputObject: Any?, expected: String) {

        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(inputObject) },
            expected = expected
        )
    }
}

import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.util.logging.Handler
import kotlin.test.assertEquals


class SecondTaskTest {

    @Test
    fun testTypeSelectionString() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection("Privet!") },
            expected = "Я получил String = 'Privet!', ее длина равна 7"
        )
    }

    @Test
    fun testTypeSelectionInt() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(234) },
            expected = "Я получил Int = 234, его квадрат равен 54756"
        )
    }

    @Test
    fun testTypeSelectionDouble() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(223.3943572) },
            expected = "Я получил Double = 223.3943572, это число округляется до 223.39"
        )
    }

    @Test
    fun testTypeSelectionDoubleWithoutFraction() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(731.0) },
            expected = "Я получил Double = 731.0, это число округляется до 731"
        )
    }

    @Test
    fun testTypeSelectionDateLess() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(LocalDate.of(2006, 12, 23)) },
            expected = "Я получил LocalData = 2006-12-23, эта дата меньше чем дата основания Tinkoff"
        )
    }

    @Test
    fun testTypeSelectionDateMore() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(LocalDate.of(2006, 12, 25)) },
            expected = "Я получил LocalData = 2006-12-25, эта дата больше или равна чем дата основания Tinkoff"
        )
    }

    @Test
    fun testTypeSelectionDateEqual() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(LocalDate.of(2006, 12, 24)) },
            expected = "Я получил LocalData = 2006-12-24, эта дата больше или равна чем дата основания Tinkoff"
        )
    }

    @Test
    fun testTypeSelectionNull() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(null) },
            expected = "Объект равен null"
        )
    }

    @Test
    fun testTypeSelectionUnknown() {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { typeSelection(Handler::class) },
            expected = "Мне этот тип неизвестен"
        )
    }

}

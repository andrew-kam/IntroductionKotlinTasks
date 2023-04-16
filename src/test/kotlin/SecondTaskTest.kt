import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.util.logging.Handler
import kotlin.test.assertEquals


class SecondTaskTest {

    @Test
    fun testTypeSelectionString() {
        assertEquals(
            "Я получил String = 'Privet', ее длина равна 6",
            captureOutput { typeSelection("Privet") })
    }

    @Test
    fun testTypeSelectionInt() {
        assertEquals(
            "Я получил Int = 145, его квадрат равен 21025",
            captureOutput { typeSelection(145) })
    }

    @Test
    fun testTypeSelectionDouble() {
        assertEquals(
            "Я получил Double = 145.2817812, это число округляется до 145.28",
            captureOutput { typeSelection(145.2817812) })
    }

    @Test
    fun testTypeSelectionDoubleWithoutFraction() {
        assertEquals(
            "Я получил Double = 145.0, это число округляется до 145",
            captureOutput { typeSelection(145.0) })
    }

    @Test
    fun testTypeSelectionDate() {
        assertEquals(
            "Я получил LocalData = 1990-01-01, эта дата меньше чем дата основания Tinkoff",
            captureOutput { typeSelection(LocalDate.of(1990,1,1)) })
    }

    @Test
    fun testTypeSelectionUnknown() {
        assertEquals(
            "Мне этот тип неизвестен",
            captureOutput { typeSelection(Handler::class) })
    }

}

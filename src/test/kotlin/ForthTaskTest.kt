import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class ForthTaskTest {

    @Test
    fun testNumberName1001() {
        assertEquals(
            message = "Output is wrong!",
            expected = "Введены некорректные данные!",
            actual = captureOutput { numberName(1001) })
    }

    @Test
    fun testNumberName1000() {
        assertEquals(
            message = "Output is wrong!",
            expected = "одна тысяча",
            actual = captureOutput { numberName(1000) })
    }

    @Test
    fun testNumberName999() {
        assertEquals(
            message = "Output is wrong!",
            expected = "девятьсот девяносто девять",
            actual = captureOutput { numberName(999) })
    }

    @Test
    fun testNumberName111() {
        assertEquals(
            message = "Output is wrong!",
            expected = "сто одиннадцать",
            actual = captureOutput { numberName(111) })
    }

    @Test
    fun testNumberName88() {
        assertEquals(
            message = "Output is wrong!",
            expected = "восемьдесят восемь",
            actual = captureOutput { numberName(88) })
    }

    @Test
    fun testNumberName19() {
        assertEquals(
            message = "Output is wrong!",
            expected = "девятнадцать",
            actual = captureOutput { numberName(19) })
    }

    @Test
    fun testNumberName1() {
        assertEquals(
            message = "Output is wrong!",
            expected = "один",
            actual = captureOutput { numberName(1) })
    }

    @Test
    fun testNumberName0() {
        assertEquals(
            message = "Output is wrong!",
            expected = "Введены некорректные данные!",
            actual = captureOutput { numberName(0) })
    }
}

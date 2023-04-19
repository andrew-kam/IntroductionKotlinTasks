import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals


class ForthTaskTest {

    @ParameterizedTest
    @CsvSource(
        "1001, Введены некорректные данные!",
        "1000, одна тысяча",
        "999, девятьсот девяносто девять",
        "503, пятьсот три",
        "110, сто десять",
        "22, двадцать два",
        "19, девятнадцать",
        "1, один",
        "0, Введены некорректные данные!"
    )
    fun testNumberName(inputNumber: Int, expected: String) {
        assertEquals(
            message = "Output is wrong!",
            actual = captureOutput { numberName(inputNumber) },
            expected = expected
        )
    }
}

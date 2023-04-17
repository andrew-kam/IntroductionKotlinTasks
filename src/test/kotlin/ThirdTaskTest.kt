import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class ThirdTaskTest {

    @Test
    fun testSquareAllElements() {

        val baseList = listOf(13.31, 3.98, 12.0, 2.99, 9.0, null, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 1.0)
        val result = 37.09

        assertEquals(
            message = "Sum is incorrect!",
            actual = captureOutput { print("%.2f".format(chainOperation(baseList))) },
            expected = result.toString()
        )
    }
}

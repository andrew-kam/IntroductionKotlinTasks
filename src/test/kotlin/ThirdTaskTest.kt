import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ThirdTaskTest {

    @Test
    fun testSquareAllElements() {

        val baseList = listOf(13.31, 3.98, 12.0, 2.99, 9.0, null)
        val result = 22.09

        assertEquals(result.toString(), captureOutput { print("%.2f".format(chainOperation(baseList))) })
    }

}
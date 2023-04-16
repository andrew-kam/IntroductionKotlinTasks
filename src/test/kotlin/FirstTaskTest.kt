import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstTaskTest {

    @Test
    fun testSquareAllElements(){
        val baseListInt = mutableListOf(
            -2147483648, -46341, -46340, -25, -16, -9, -4, -1, 0, 1, 4, 9, 16, 25, 46340, 46341, 2147483647
        )
        baseListInt.squareAllElements()

        val modifiedListInt = mutableListOf(
            0, -2147479015, 2147395600, 625, 256, 81, 16, 1, 0, 1, 16, 81, 256, 625, 2147395600, -2147479015, 1
        )

        assertEquals(message = "Error", actual = baseListInt, expected = modifiedListInt)
    }
}

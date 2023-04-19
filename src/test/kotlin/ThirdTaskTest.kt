import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals


class ThirdTaskTest {

    companion object {
        @JvmStatic
        private fun squareAllElementsProvider(): Stream<Arguments> =
            Stream.of(
                Arguments.of(listOf(13.31, 3.98, 12.0, 2.99, 9.0), "22.09"),
                Arguments.of(listOf<Double?>(), "0.00"),
                Arguments.of(listOf<Double?>(null, null, null), "0.00"),
                Arguments.of(listOf(13.31, 3.98, -12.0, 2.99, 9.0, null, 5.0, 5.0, 5.0, -5.0, 5.0, 5.0, 1.0), "35.09")
            )
    }

    @ParameterizedTest
    @MethodSource("squareAllElementsProvider")
    fun testSquareAllElements(baseList: List<Double?>, result: String) {

        assertEquals(
            message = "Sum is incorrect!",
            actual = captureOutput { print("%.2f".format(chainOperation(baseList))) },
            expected = result
        )
    }
}

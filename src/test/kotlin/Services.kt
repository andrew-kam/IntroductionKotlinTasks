import java.io.ByteArrayOutputStream
import java.io.PrintStream


fun captureOutput(block: () -> Unit): String {
    val outPut = ByteArrayOutputStream()
    System.setOut(PrintStream(outPut))
    block()
    System.setOut(System.out)
    return outPut.toString().trim()
}

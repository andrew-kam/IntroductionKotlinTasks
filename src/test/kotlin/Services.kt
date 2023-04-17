import java.io.ByteArrayOutputStream
import java.io.PrintStream


fun captureOutput(functionOutput: () -> Unit): String {
    val outPut = ByteArrayOutputStream()
    System.setOut(PrintStream(outPut))
    functionOutput()
    System.setOut(System.out)
    return outPut.toString().trim()
}

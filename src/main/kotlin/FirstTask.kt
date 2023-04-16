import kotlin.math.absoluteValue


fun MutableList<Int>.squareAllElements() {

    val minIntNumber = -2147483648
    val maxValueElement = 46340

    this.forEachIndexed { index: Int, value: Int ->

        this[index] = value * value

        if (value.absoluteValue > maxValueElement || value == minIntNumber) {
            println("Переполнение типа Int на элементе $value, индекс - [$index]")
        }
    }
}

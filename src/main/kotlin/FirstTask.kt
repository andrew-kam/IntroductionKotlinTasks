fun MutableList<Int>.squareAllElements() {
    this.indices.forEach { this[it] = this[it] * this[it] }
    }

fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4)
    println(mutableList)
    mutableList.squareAllElements()
    println(mutableList) // [1, 4, 9, 16]
}

fun MutableList<Int>.squareAllElements() {

    this.forEachIndexed { index: Int, value: Int ->

        this[index] = value * value

        if (value.toLong() * value.toLong() > Int.MAX_VALUE) {
            println("Переполнение типа Int на элементе $value, индекс - [$index]")
        }
    }
}

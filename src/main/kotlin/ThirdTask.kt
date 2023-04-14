fun chainOperation (list: List<Double?>): Double {
    return list
            .asSequence()
            .filterNotNull()
            .map { if (it.toInt() % 2 == 0) it * it else it / 2 }
            .filter { it.toInt() <= 25 }
            .sortedDescending()
            .take(10)
//            .toList()
            .sum()
}


fun main() {

    val myList = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
    println(chainOperation(myList))
    println("%.2f".format(chainOperation(myList)))

}









//round - округляет результат до двух знаков после запятой.

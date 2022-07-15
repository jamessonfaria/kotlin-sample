package br.com.jamesson

fun main() {
    val ints = listOf(1,2,3,4,5)
    val greaterThanThree = {v:Int -> v > 3}

    //var largeInts = ints.all { it > 3 }
    var largeInts = ints.all(greaterThanThree)
    println(largeInts)

    //largeInts = ints.any { it > 3 }
    largeInts = ints.any(greaterThanThree)
    println(largeInts)

    //var numberOfLargeInts = ints.count { it > 3 }
    var numberOfLargeInts = ints.count(greaterThanThree)
    println(numberOfLargeInts)

    //var found = ints.find(greaterThanThree)
    val found: Int? = ints.find { it > 6 }
    println(found)

}
package br.com.jamesson

import java.util.stream.Collector

fun main() {
    val ints = listOf(1,2,3,4,5)

    // filter
    val smallInts = ints.filter{ it -> it < 4 }
    for (i: Int in smallInts) println(i)

    println("***************************")

    // map
    val squaredInts = ints.map{ it * it }
    for (i: Int in squaredInts) println(i)

    println("***************************")

    // filter and map
    val smallSquaredInts = ints
                            .filter { it < 5 }
                            .map { it * it }
    for (i: Int in smallSquaredInts) println(i)

    val meetings = listOf(Meeting2(1, "Board Meeting"), Meeting2(2, "Comittee Meeting"))
    val titles: List<String> = meetings
                                .filter { it -> it.title.startsWith("C")  }
                                .map { m -> m.title }
    for (t in titles) println(t)

    // USE SEQUENCE "asSequence" (PARA TRABALHAR COM GRANDE VOLUME DE DADOS NAS LISTAS)
    // USANDO SEQUENCE A LISTA FICA LAZY, APENAS QUANDO É NECESSARIO ELA É PROCESSADA
    val titlesSequence = meetings
        .asSequence()
        .filter { println("filter($it)"); it.title.endsWith("g")  }
        .map { println("map($it"); it.title }
    for (t in titlesSequence) println(t)

}

class Meeting2(val id: Int, val title: String){
    val people = listOf(Person("Sam"), Person("Alex"))
}
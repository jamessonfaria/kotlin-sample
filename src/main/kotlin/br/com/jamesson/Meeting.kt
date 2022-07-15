package br.com.jamesson

import java.util.*

class Meeting {
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
    fun printData(){
        println("Title: $Title, When: $When, Who: $Who")
    }
}

fun main() {
    val m = Meeting()
    m.Title = "Board Meeting"
    m.When = Date(2017, 1, 1)
    m.Who.add("Kevin")

    // inicializa os atributos de um objeto dentro de uma lambda
    with(m) {
        Title = "Board Meeting"
        When = Date(2017, 1, 1)
        Who.add("Kevin")
    }

    // inicializa os atributos de um objeto e invoca um metodo dentro de uma lambda
    m.apply {
        Title = "Board Meeting"
        When = Date(2017, 1, 1)
        Who.add("Kevin")
    }.printData()
}
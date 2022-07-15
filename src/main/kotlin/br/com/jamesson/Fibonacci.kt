package br.com.jamesson

fun main() {
    var program = Program1()
    program.fibonacci(8)
}

class Program1 {
    fun fibonacci(limit: Int){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            println(current)
            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}
package br.com.jamesson

fun main() {
    var program = Program2()
    //program.fibonacci(8)
    program.fibonacci(8, object: Process{
        override fun execute(value: Int) {
            println(value)
        }
    })
}

interface Process {
    fun execute(value: Int)
}

class Program2 {
    fun fibonacci(limit: Int, action: Process){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
           // println(current)
            action.execute(current) // aqui é a estrategia
            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}
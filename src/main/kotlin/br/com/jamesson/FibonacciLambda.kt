package br.com.jamesson

fun main() {
    var program = Program3()
    //program.fibonacci(8)
    //program.fibonacci(8) { n -> println(n) }
    //program.fibonacci(8) { println(it) }
    program.fibonacci(8, ::println) // method reference

}

class Program3 {
    fun fibonacci(limit: Int, action: (Int) -> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
           // println(current)
            action(current) // aqui é a estrategia
            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}
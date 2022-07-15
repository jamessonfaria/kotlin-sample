package br.com.jamesson

/*
* Closure - permite que vc altere o valor de uma variavel
* externa dentro de uma lambda
*
*/

fun main() {
    var program = Program4()
    var total = 0

    program.fibonacci(8) {it -> total += it}
    println(total)

}

class Program4 {
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
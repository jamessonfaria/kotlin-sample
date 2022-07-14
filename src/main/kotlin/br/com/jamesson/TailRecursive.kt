package br.com.jamesson

import java.math.BigDecimal
import java.math.BigInteger

fun main(args: Array<String>) {
    println(fib(10000, BigInteger("1"), BigInteger("0"))) // stack over flow
}

// informando que essa funcao é "tailrec" o compilador faz varios loops em vez de usar recursividade
// evitando o stack over flow
// para usar a recursividade tem que garantir o que é exigido para uma funcao recursiva
tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}
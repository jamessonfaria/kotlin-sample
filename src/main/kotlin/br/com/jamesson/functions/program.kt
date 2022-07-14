@file:JvmName("DisplayFunctions")
package br.com.jamesson.functions

fun main(args: Array<String>) {
    display("Hello, world")
    println(max(1,2))
    log("Helloooooooo")
}

@JvmOverloads // realiza overload da classe kotlin no java
fun log(message: String, logLevel: Int = 1){
    println("$message - level: $logLevel")
}

fun display(message: String) : Boolean{
    println(message)
    return true
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
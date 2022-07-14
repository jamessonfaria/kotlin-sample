package br.com.jamesson

fun main(args: Array<String>) {
    val h1 = Header("H1")
    val h2 = Header("H2")

    //val h3 = h1.plus(h2)
    val h3 = h1 plus h2
    println(h3.Name)

    val h4 = h1 + h2
    println(h4.Name)

}

class Header(var Name: String){}

operator infix fun Header.plus(other: Header) : Header {
    // o infix permite que tornamos a sintaxe da chamada mais simples sem usar parametros feito a linha 8
    // operator permite sobrecarregar os operadores, nesse caso o "+"
    return Header(this.Name + other.Name)
}
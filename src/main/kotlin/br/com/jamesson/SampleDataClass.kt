package br.com.jamesson

fun main() {
    var kevin = StudentNovo(1, "Kevin")
    var jones = StudentNovo(1, "Kevin")

    println(kevin)

    if (kevin == jones)
        println("Equal")
    else
        println("Not equal")

    var newKevin = kevin.copy(name = "Robert")
    println(newKevin)
}

data class StudentNovo(val id: Int, val name: String){

}
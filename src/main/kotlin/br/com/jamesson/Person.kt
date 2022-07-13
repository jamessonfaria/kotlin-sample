package br.com.jamesson

class Person(var Name: String) {
    fun display() {
        println("Display: ${Name}")
    }

    fun displayWithLambda(func: (s:String) -> Unit){
        func("Display with lambda: ${Name}")
    }
}
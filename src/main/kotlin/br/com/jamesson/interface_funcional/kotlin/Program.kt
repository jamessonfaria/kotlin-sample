package br.com.jamesson.interface_funcional.kotlin

import br.com.jamesson.interface_funcional.java.User

fun main() {
    var user = User("Kevin")

    var count = 0

    user.create { println("User $it has been created: ${++count} times") }
    user.create { println("User $it has been created: ${++count} times") }
}
package br.com.jamesson.interface_funcional.kotlin

import br.com.jamesson.interface_funcional.java.Created
import br.com.jamesson.interface_funcional.java.User
fun main() {
    var user = User("Kevin")

    var count = 0

    //var eventListener = { u: User -> println("User $u has been created: ${++count} times") }
    // USANDO CONSTRUTOR SAM PARA FUNCOES ANONIMAS, CRIADO PELO COMPILADOR
    var eventListener = Created { println("User $it has been created: ${++count} times") }

    user.create(eventListener)


    user.create { println("User $it has been created: ${++count} times") }
}
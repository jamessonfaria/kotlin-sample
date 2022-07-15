package br.com.jamesson

/*
* Classe Selada - permite um maior controle
* da sua hierarquia de classes, bom uso é quando
* se tem um conjunto restrito de classes derivadas
*
* */

sealed class PersonEvent {
    class Awake: PersonEvent()
    class Asleep: PersonEvent()
    class Eating(val food: String): PersonEvent()
}

fun handlePersonEvent(event: PersonEvent){
    when(event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}

fun main() {

    val sleep = PersonEvent.Asleep()
    handlePersonEvent(sleep)

    val food = PersonEvent.Eating("pasta")
    handlePersonEvent(food)

}
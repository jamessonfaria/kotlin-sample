package br.com.jamesson

fun main() {
    val meetings = listOf(Meeting2(1, "Board Meeting"), Meeting2(2, "Comittee Meeting"))

    val people: List<Person> = meetings.flatMap(Meeting2::people).distinct()
    for (p in people) println(p.Name)
}
package br.com.jamesson.nullability.kotlin

import br.com.jamesson.nullability.java.Meeting

fun main() {

    val m = Meeting()
    m.addTitle("Title")
    // m.addTitle(null)
    val title: String? = m.meetingTitle()

    println(title)

}
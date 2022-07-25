package br.com.jamesson.nullability.kotlin

import br.com.jamesson.nullability.java.Address
import br.com.jamesson.nullability.java.Meeting

fun main() {

    val m = Meeting()
    // m.addTitle("Title")
    // m.addTitle(null)
    // val title: String? = m.meetingTitle()

    // println(title)

    val title2: String = m.titleCanBeNull() ?: "nobody"
    println(title2)

}

class HomeAddress : Address {
    override fun getFirstAddress(): String {
        return ""
    }
}

class WorkAddress : Address {
    override fun getFirstAddress(): String?{
        return ""
    }
}
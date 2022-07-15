package br.com.jamesson

fun main() {
    val kevin = Student3("Kevin","Jones",1)
    println(kevin.id)

    val carlos = Student3("Carlos", "Silva", 2, "Vanessa")
    println(carlos.tutor)
}

abstract class PersonConstructor(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

//class Student3(val id: Int) : PersonConstructor() {
class Student3(firstName: String, lastName: String, _id: Int, var tutor: String = "") : PersonConstructor(firstName, lastName) {
    //val id = _id
    val id: Int
    //var tutor: String

    init {
        id = _id
    //    tutor = ""
    }

//    constructor(firstName: String, lastName: String, _id: Int, tutor: String) : this(firstName, lastName, _id) {
//        this.tutor = tutor
//    }

    override fun getAddress(): String {
        return "Address for ${super.firstName} / ${super.lastName}"
    }

    override fun getName(): String {
        return ""
    }
}
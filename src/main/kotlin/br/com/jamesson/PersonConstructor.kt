package br.com.jamesson

fun main() {
    val kevin = Student3("Kevin","Jones",1)
    println(kevin.id)

    val carlos = Student3("Carlos", "Silva", 2, "Vanessa")
    println(carlos.tutor)

    Courses.initialize()
    val curso = carlos.enrole("Kotlin Avancado")
    println(curso)

    Student3.createPostgrad("Simon")
    Student3.createUndergrad("Kevin")

    println(Student3.toXml(carlos))
}

abstract class PersonConstructor(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

//class Student3(val id: Int) : PersonConstructor() {
open class Student3(firstName: String, lastName: String, _id: Int, var tutor: String = "") : PersonConstructor(firstName, lastName) {
    //val id = _id
    val id: Int
    //var tutor: String

    init {
        id = _id
    //    tutor = ""
    }

    fun enrole(courseName: String) : Course? {
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()

        return course
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

    // Companion Object = permite a classe estudante virar uma fabrica
    // das classes concretas que as herdam
    // tambem é permitido um companion object implementar uma interface
    companion object : XmlSerializer<Student3> {
        fun createUndergrad(name: String) : Undergraduate {
            return Undergraduate(name)
        }

        fun createPostgrad(name: String) : Postgraduate {
            return Postgraduate(name)
        }

        override fun toXml(Item: Student3) : String {
            return "<xml>${Item.id} - ${Item.firstName}</xml>"
        }
    }
}

class Undergraduate(firstName: String) : Student3(firstName, "", 1){
}

class Postgraduate(firstName: String) : Student3(firstName, "", 1){
}

interface XmlSerializer<T> {
    fun toXml(Item: T) : String
}
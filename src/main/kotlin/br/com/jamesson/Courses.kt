package br.com.jamesson

data class Course(val Id: Int, val Title: String){
}

// object define um singles para a classe Courses, o koltin nao tem static,
// dessa forma usando "object" vc nao cria instancias para a classe
object Courses {
    var allCourses = arrayListOf<Course>()

    fun initialize(){
        allCourses.add(Course(1, "Kotlin Avancado"))
        allCourses.add(Course(2, "Kotlin com Android"))
        allCourses.add(Course(3, "Kotlin com Spring"))
        allCourses.add(Course(4, "Kotlin com Micronaut"))
    }
}
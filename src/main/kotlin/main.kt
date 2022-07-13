import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {

    var numbers = listOf(1,2,3,4,5)

    //for (i in 1 .. 10 step 2)
    //for (i in 1 until  10)
    for (i in numbers){
        println(i)
    }

    var ages = TreeMap<String, Int>();
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name, age) in ages){
        println("$name is $age")
    }

    for((index, element) in numbers.withIndex()){
        println("$element at $index")
    }

    var range = 'a'..'z'

//    println("Hello, world")
//    val q:Question = Question()
//    //q.Answer  = "42"
//    q.Answer  = "Four"
//   //.Question = ""
//
//
//    q.display()
//
//    println("The answer to the question ${q.Question} is ${q.Answer}")
//
//    val message = if(q.Answer == q.CorrectAnswer) "You were correct" else "Try again?"
//
//    println(message)
//
//    q.printResult()
//
//    val number:Int? = try {
//        Integer.parseInt(q.Answer)
//    } catch (e: NumberFormatException){
//        null
//    }
//
//    println("Number is $number")
}

class Question(){
    var Answer:String? = null
    val Question:String = "What is the answer to life"
    val CorrectAnswer = "42"

    fun display(){
        println("You said $Answer")
    }

    fun printResult(){
        when (Answer) {
            CorrectAnswer -> println("You were correct")
            else -> println("Try again?")
        }
    }


}
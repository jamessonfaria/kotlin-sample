fun main(args: Array<String>) {
    println("Hello, world")
    val q:Question? = Question()
    q?.Answer  = "42"
   //.Question = ""


    q?.display()

    println("The answer to the question ${q?.Question} is ${q?.Answer}")

    val message = if(q?.Answer == q?.CorrectAnswer) "You were correct" else "Try again?"

    println(message)
}

class Question(){
    var Answer:String? = null
    val Question:String = "What is the answer to life"
    val CorrectAnswer = "42"

    fun display(){
        println("You said $Answer")
    }


}
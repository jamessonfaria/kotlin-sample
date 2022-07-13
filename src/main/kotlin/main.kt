fun main(args: Array<String>) {
    println("Hello, world")
    val q = Question()
    q.Answer  = "42"
   //.Question = ""

    q.display()

    println("The answer to the question ${q.Question} is ${q.Answer}")
}

class Question(){
    var Answer:String = ""
    val Question:String = "What is the answer to life"

    fun display(){
        println("You said $Answer")
    }


}
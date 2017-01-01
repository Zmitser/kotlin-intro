package basics

fun main(args: Array<String>) {
    val result: String = "Value"
    val whenValue =  when (result){
        "Value" -> {
            println("This is value")
            println("Second statement")
            "Return from first when case!"
        }
        is String -> {
            println("Excellent")
            "Remove that"
        }
        else -> {
            println("It came to this?")
            "This warning now gone"
        }
    }
    println(whenValue)
}

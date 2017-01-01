package functions

fun hello():Unit {
    println("Hello!")
}
fun throwingExceptions():Nothing {
    throw Exception("This function throw exception")
}
fun returnFour():Int {
    return 4
}
fun takingString(name:String) {
    println(name)
}
fun sum (x:Int, y:Int, z:Int = 0, w:Int = 0) = x + y + z + w

fun printDetails(name:String, email:String = "", phone:String = "NA") = println("name: $name - email: $email - phone: $phone")


fun printStrings(vararg strings:String)= realyPrintStrings(*strings)


private fun realyPrintStrings(vararg strings:String){
    strings.forEach {string ->  println(string) }
}

fun main(args: Array<String>) {

    hello()
    val value = returnFour()
    takingString("Some Value")

    sum(1, 2)
    sum(1, 2, 3, 4)

    printDetails("Zmitser", phone = "555-555", email = "1@2.by")

    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")
}
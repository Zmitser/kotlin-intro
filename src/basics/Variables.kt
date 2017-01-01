package basics

fun main(args: Array<String>) {

    var streetNumber:Int = 10
    var streeName:String = "Hight Street"

    val zip:String = "GF PB"

    streeName = "Low Street"
//    zip = "fdsfds" Compilation Error

    val myLong = 10L
    val myFloat = 10F
    val myHex = 0x0F
    val myBinary = 0xb01


    val myInt = 100
    val myLongAgain = myInt.toLong()


//    String
    val myChar =  'A'
    val myString = "My String"

    val escapeCharacter= "A new line \n"

    val rawString = "Hello, " +
            "My " +
            "Friend!"

    val multipleString = """
        Hello First String
        Second String
        Third String
    """

    val years = 10
    val message = "A decade is $years years!"

    val name = "Random Name"

    val anotherMessage = "Length of name is ${name.length}"


}
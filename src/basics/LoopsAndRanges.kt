package basics

fun main(args: Array<String>) {
    for (a in 1..10){
        println(a)
    }

    val numbers = 1..10

    for (a in numbers){
        println(a)
    }

    for (a in 10 downTo 1){
        println(a)
    }

    for (a in 10..1){
        println(a)
    }

    for (a in 10 downTo 0 step 5){
        println(a)
    }

    val capitals = arrayOf("London", "Paris", "Madrid", "Rome")

    for (capital in capitals){
        println(capital)
    }

    var i = 100
    while (i > 0) {
        i--
    }

    do {
        var x = 10
        x--
    } while (x > 10)


    loop@ for (l in 1..100) {
        for (j in 1..100) {
            if (j % l == 0) {
                continue
            }
        }
    }
}

/*
* Block Comment
* second line
*/
fun main() {
    var x = 5
    val y = 3.0

    // Basic Math
    println("+ :${x + y}")
    println("- :${x - y}")
    println("* :${x * y}")
    println("/ :${x / y}")
    println("% :${x % y}")

    var result = x + y

    result += 2
    println("\nresult: $result")

    result -= 2
    println("result: $result")

    result *= 2
    println("result: $result")

    result /= 2
    println("result: $result")

    result %= 2
    println("result: $result")

    println("\n${(3 + 4) * 4}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")
    println("x = ${x--}")
    println("x = ${--x}")

    val learnerMark = 30
    if (learnerMark < 0 || learnerMark > 100) {
        println("Error")
    }else if (learnerMark < 30) {
        println("learner Failed")
    }else{
        println("Learner Passed")
    }
}
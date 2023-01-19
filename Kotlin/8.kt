fun timesThree(n: Int): Int {
    return n*3
}
fun timesFour(n: Int): Int = (n*4)

fun main() {
    val number: Int = 10
    println("Number times three: ${timesThree(number)}")
    println("Number times four: ${timesFour(number)}")
}
fun main() {
    val num: Int = 5
    when(num) {
        in 1..10 -> println("Between 1 and 10")
        in 11..20 -> println("Between 11 and 20")
        else -> println("None")
    }
}
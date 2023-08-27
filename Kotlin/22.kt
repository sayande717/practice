fun main() {
    val list = listOf(1,2,null,7,2)
    println("List without the null elements: ${list.filterNotNull()}")
}
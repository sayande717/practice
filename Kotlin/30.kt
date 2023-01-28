interface myInterface1 {
    fun hello() = println("Hello!")
    fun greetings() // Function with no implementation
}

interface myInterface2 {
    fun leave() = println("Have a nice day!")
}

// A class can implement (inherit from) multiple interfaces.
class something: myInterface1,myInterface2 {
    // Function implemented here
    override fun greetings() {
        println("Greetings!")
    }
}

fun main() {
    val ob = something()
    ob.hello()
    ob.greetings()
    ob.leave()
}
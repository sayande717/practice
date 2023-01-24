class Dog {
    var breed: String = "Labrador"
    var color: String = "Brown"
    var age: Int = 3
    fun eat():String {
        return "${breed}s eat"
    }
    fun bark(): String {
        return "${breed}s bark"
    }
}

fun main() {
    val ob = Dog()
    println(ob.eat())
    println(ob.bark())
}
// Super-class
// open: The class/method can be inherited by another class.
open class Animal(val legs:Int, val color:String) {
    fun eat() {
        println("I eat")
    }
    fun sleep() {
        println("I sleep")
    }

    open fun sounds() {
        println("I make a sound")
    }
}

//Sub-class 1
class Dog(legs:Int, color:String): Animal(legs,color) {
    // override: Override the method in the super-class
    override fun sounds() {
        println("I bark")
    }
}

//Sub-class 2
class Cat(legs:Int, color:String): Animal(legs,color) {
    override fun sounds() {
        println("I purr")
    }
}

fun main() {
    val dogOb = Dog(4,"Black")
    val catOb = Cat(4,"White")
    dogOb.eat()
    dogOb.sleep()
    dogOb.sounds()
    println()
    catOb.eat()
    catOb.sleep()
    catOb.sounds()
}
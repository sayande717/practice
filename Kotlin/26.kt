// Primary constructor
class Dog(var breed:String, var color:String, var age:Int) {

    var name:String? = null

    // Secondary constructor, 'this(breed,color,age)' tells the compiler that these variables have already been initialized.
    constructor(breed:String, color:String,age:Int,name:String):this(breed,color,age) {
        this.name = name
    }
}

fun main() {
    // Invokes primary constructor
    val dog1 = Dog("Labrador","Brown",3)
    // Invokes secondary constructor
    val dog2 = Dog("German Shepherd","Black",2,"Jerry")
}
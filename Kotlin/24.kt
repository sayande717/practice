// The keyword 'constructor' is optional.
class Dog constructor (breed:String, color:String, age:Int) {
    // Initialising the values
    var breed:String
    var color:String
    var age:Int
    
    init {
        this.breed = breed
        this.color = color
        this.age = age
    }

    fun eat():String {
        return "${breed}s eat"
    }

    fun bark(): String {
        return "${breed}s bark"
    }
}

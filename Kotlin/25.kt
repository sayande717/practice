
class Dog (val breed:String, val color:String, val age:Int) {
    fun eat():String {
        return "${breed}s eat"
    }

    fun bark(): String {
        return "${breed}s bark"
    }
}

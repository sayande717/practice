fun main() {
    val num:Int? = null
    var str:String? = "String"
    str = null
    println(num ?: "The value is null")
    println(str?.length ?: "The value is null")
}
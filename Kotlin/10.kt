fun main() {
    val str:String = "Hello, world!"
    val str2:String = "Hello!"
    println(str.length)
    println(str.get(4)) // Get the character at the specified index.
    println(str.indexOf('e')) // Get the index of the specified character.
    println(subSequence(1,5)) // Get the sub-string from index 1 to 4 (5 excluded)   
    println(str.equals(str2)) // Returns true if 'str' and 'str2' are equal.
    println(str.plus("string")) // Concatenates 'string' with str.
}
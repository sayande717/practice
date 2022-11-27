/*
 * var = Variables ie value can be changed.
 * val = Constants ie value cannot be changed.
 * Function syntax:
 * fun <function-name> (<var-1>:<DataType>,<var-2>:<DataType>):<Function-Return-Type> { <Body> }
 * For functions with no return type, the default type is 'Unit'.
 * It's set to 'Unit' for such functions by default.
 */
fun calc(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun main()
{
    var num1 = 12
    var num2 = 8
    //Print numbers using $var
    println("1st number: $num1")
    println("2nd number: $num2")
    /* 
     * Any operations within println is to be placed within ${}
     * Syntax 1: ${num1 <oper> num2}
     * Syntax 2: ${function(num1,num2)}
     * 
     */
    println("Addition 1: ${num1+num2}")
    //Syntax: ${function(num1,num2)}
    println("Addition 2: ${calc(num1,num2)}")
}
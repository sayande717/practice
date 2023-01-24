fun divide(quotient:Int,divisor:Int):Int {
    if(divisor == 0) {
        return -1
    }
    else {
        return (quotient/divisor)
    }
}

fun main() {
    val a = 12
    val b = 14
    val result = divide(a,b)
    if(result == -1) {
        println("Divisor cannot be 0!")
    }
    else {
        println("Result: $result")
    }
}
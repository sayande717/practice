fun main() {
    val a:Int = 12
    val b:Int = 0
    val op:Char = '/'
    println("Answer: ${operate(a,op,b)}")
}

fun operate(num1:Int,op:Char,num2:Int):Int {
    val operators = listOf<Char>('+','-','*','/')
    when(op) {
        operators[0] -> return num1+num2
        operators[1] -> return num1-num2
        operators[2] -> return num1*num2
        operators[3] -> when {
            num2==0 -> return -1
            else -> return num1 / num2
        }
    }
    return -2
}
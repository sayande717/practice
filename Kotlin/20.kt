fun main() {
    try {
        val num1:Int = 12
        val num2:Int = 0
        println("Answer: ${num1/num2}")
    }
   catch(e:ArithmeticException) {
       println(e)
   }
   finally {
    println("This block is optional. All code after the 'catch' block will be executed anyways.")
   }
}
/* Function declaration:
 * fun sum(var1:DataType1,var2:DataType2):DataType3
 * DataType1,DataType2 = Data types of the variables var1 & var2.
 * DataType3 = Return type / Data type of the function.
 * */
fun sum(a:Int,b:Int):Int
{
    return (a+b);
}
//Shorthand method, when there is only 1 line in the function.
fun sum2(a:Int,b:Int) = (a+b);
fun main()
{
    /*
     * var = Value can be changed.
     * val = Constant, value cannot be changed. 
     * 
     * */
    var a = 20;
    val b = 30;
    //Precede variables/constants with $.
    println("Sum: ${sum(a,b)}")
}
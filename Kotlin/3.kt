fun greeting()
{
    println("Welcome 1!");
}

fun greeting(str: String)
{
    println("Welcome $str!");
}

fun greeting(str: String,count:Int)
{
    print("Welcome $str!");
    println(" Your index is: $count");
}
//Function with default value for it's parameter
fun greeting(str: String,str2:String="DEF")
{
    print("Welcome $str!");
    println("Default string: $str2");
}

fun main()
{
    greeting();
    greeting("ABCD");
    greeting("ABCD",5);
}
fun main()
{
    //Initialising the variable
    var age:Int
    //Assigning a value to it.
    age = 12;
    println("Age: $age")
    
    //Creating a non-mutable list.
    //By default, lists in Kotlin are non-mutable.
    val list1:List<String> = listOf("ABCD","DEF","FGHI");
    //Creating a mutable list
    var list2:MutableList<String> = mutableListOf("ABCD","DEF","FGHI");
    //Finding list size
    println("List 1 size: ${list1.size}")
    //Iterate through each element in the list 1 by 1, using foreach loop.
    println("List 1 elements: ")
    list1.forEach()
    {
        i->println(i)
    }
    list2.add("XYZ");
    println(list1)
    println(list2)
} 
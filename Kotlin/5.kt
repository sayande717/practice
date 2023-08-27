class Car 
{
    /* Initialising variables within the function declaration.
     * item1 = variable
     * item2 = Constructor variable
     */
    fun engine(var item1:Int,item2:Int) : String
    {
        var name: String = "Engine1"
        return name
    }
    //Anything within the init block is always executed right when an instance of a class is created.
    init 
    {
        //Statements
    }
}

class Car2
{
    fun main()
    {
        //Creating a new instance of the class 'Car'
        var car = Car()
        //Running a method from that class.
        car.engine()
    }
}
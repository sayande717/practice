/*
 * Interfaces - Pre-defined structure for a class, with pre-defined functions.
 * Declare an interface using the 'interface' keyword.
 */
interface Car
{
    // Abstract methods - These methods don't have a function body.
    fun accelerate()
    fun decelerate()
    //We can also define methods in an interface
    fun getBrandID() : String
    {
        return "ABCD1234"
    }
}

class MyCar : Car
/* 
 * class MyCar:Car2,Car
 * Use comma ',' to separate the classes / interfaces, if the class inherits from multiple classes / uses multiple interfaces.
 */
{
    //Here, we need to declared the abstract methods
    override fun accelerate()
    {
        println("In function accelerate")
    }
    override fun decelerate()
    {
        println("In function decelerate")
    }
    fun main()
    {
        //getBrandID() is a pre-defined function of the 'Car' Interface.
        println(getBrandID())
    }
}
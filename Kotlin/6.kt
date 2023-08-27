open class Car2
{
    var Speed = 100;
    fun speed() : Int
    {
        return Speed
    }
}

//MyCar is extending Car2
class MyCar : Car2()
{
    var maxSpeed = 150;
    fun start()
    {
        println("Engine Started");
    }
    fun main(args: Array<String>) 
    {
        val Carob = MyCar()
        //println(Carob.maxSpeed)
        println(Carob.speed())
    }
}
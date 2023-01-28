data class list(
    val dayOfWeek:List<String> = listOf<String>("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")

)

interface Tasks {
    fun ringAlarm(time:String,dayBlacklist:List<String>)
    fun makeCoffee(variant:String,sugarQty:Int)
    fun heatWater(temperature:Int,dayOfBath:String)
    fun packBag(dayOfWeek:String)
    fun cookFood(foodPreference:String)
    fun ironClothes(clothTop:String,clothBottom:String)
}

class Robo(): list,Tasks {
    override fun ringAlarm(time:String,dayBlacklist:List<String>) {
        val dayOfWeekAlarm = dayOfWeek
        for (day in dayOfWeekAlarm) {
            
        }

    }
}

fun main() {
    val ob = list()
    println(ob.list)
}
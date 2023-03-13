import java.util.Calendar;

// Main class
class Robot(val name: String) {

    fun setAlarm(time: String):String = "It's ${time}, wake up!"

    fun makeCoffee(coffee: Coffee):String {
        val coffeeType = if(coffee.black) {
            "black coffee"
        }
        else {
            "coffee"
        }

        return "Your ${coffeeType} is ready!"
    }

    fun takeBath(temperature: Int):String = "Water set to temperature: ${temperature}"

    fun packBag(day: Int):String {
        val messageTemplate = "Today's Time Table: "
        val subjects =
            arrayOf<String>(
                "English",
                "Physics",
                "Chemistry",
                "Mathematics",
                "Geography",
                "History"
            )

        when (day) {
            Calendar.MONDAY -> return "$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}"
            Calendar.TUESDAY -> return "$messageTemplate ${subjects[4]}, ${subjects[1]}, ${subjects[0]}"
            Calendar.WEDNESDAY -> return "$messageTemplate ${subjects[1]}, ${subjects[3]}, ${subjects[4]}"
            Calendar.THURSDAY -> return "$messageTemplate ${subjects[3]}, ${subjects[1]}, ${subjects[5]}"
            Calendar.FRIDAY -> return "$messageTemplate ${subjects[5]}, ${subjects[0]}, ${subjects[2]}"
            else -> return "Invalid day or maybe its holiday today!!"
        }
    }

    fun cookFood():String {
        val breakfastList = listOf<String>("Oats","Bread","Noodles","Cereals","Cornflakes")
        val lunchList = listOf<String>("Vegetable Rice","Fish Rice","Chicken Rice","Dal Roti")
        return "Today's breakfast is ${breakfastList.random()} and lunch is ${lunchList.random()}"
    }

    fun ironClothes(shirtColor: String, trouserColor: String):String {
        val shirtColorsList = listOf<String>("Red","Green","Blue")
        val trouserColorsList = listOf<String>("White","Blue","Black")
        if (shirtColorsList.contains(shirtColor) && trouserColorsList.contains(trouserColor)) {
            return "The clothes you chose are ready for you to wear!"
        }
        else {
            return "The Shirt / Trouser you selected is not available."
        }
    }
}

// Data Classes
data class Coffee(val black: Boolean, val spoonsOfSugar: Int)

fun main() {
    val default = Robot("Robo")
    // var inputPrefix = "Inputs:"

    // println("${inputPrefix} Time = 05:30")
    println(default.setAlarm("05:30"))

    println()
    
    // println("${inputPrefix} Coffee with no milk & 1 spoon of sugar")
    println(default.makeCoffee(Coffee(true, 1)))

    println()

    // println("${inputPrefix} Water temperature = 37")
    println(default.takeBath(37))

    println()

    // println("${inputPrefix} Day = Monday")
    println(default.packBag(Calendar.getInstance().get(Calendar.MONDAY)))

    println()

    // println("${inputPrefix} No inputs")
    println(default.cookFood())

    println()

    // println("${inputPrefix} Shirt color: Red\nTrouser color: Black")
    println(default.ironClothes("Red", "Black"))

}
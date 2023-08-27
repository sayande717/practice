fun for-loop() {
    for(i in 1..10) {
        println(i)
    }
    // i = i + 1
    for(i in 1..10) {
        println(i)
    }

    // i = i + 2
    for(i until 10 step 2) {
        println(i)
    }
    
    // i runs from 10 to 1
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun while-loop() {
    var i:Int = 1
    while(i <= 10) {
        println(i)
        i++
    }
}

fun do-while-loop() {
    var i:Int = 1
    do {
        println(i)
        i++
    } while(i <= 10)
}

fun main() {
    for-loop()
    while-loop()
    do-while-loop()
}
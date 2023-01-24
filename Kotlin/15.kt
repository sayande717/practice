fun main() {
    val num = 2
    var numberInWords: String
    when(num) {
        0 -> numberInWords = "Zero"
        1 -> numberInWords = "One"
        2 -> numberInWords = "Two"
        3 -> numberInWords = "Three"
        4 -> numberInWords = "Four"
        5 -> numberInWords = "Five"
        6 -> numberInWords = "Six"
        7 -> numberInWords = "Seven"
        8 -> numberInWords = "Eight"
        9 -> numberInWords = "Nine"
    }
    println("Number is words: $numberInWords")
}
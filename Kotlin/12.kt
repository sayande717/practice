fun main() {
    val list = mutableListOf<Int>(1,2,3,6,4)
    val list2 = mutableListOf<Int>() // We can also create an empty list
    list2.add(7) // Add element '7' to the list.
    list += 7 // Add element '7' to the end of the list.
    list.add(1, 7) // Add element '7' to index '1' of the list.
    println(list) // The list can directly be printed here.
    list.remove(2) // Remove the specified element
    list.removeAt(3) // Remove the element at index 3
    val arr = arrayOf(10,11,12)
    list.addAll(arr) // Add an array to the mutable list.
    println(list2)
}
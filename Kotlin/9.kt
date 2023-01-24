import java.util.Arrays;

fun main() {
    // Method 1, here we're creating a mutable list
    val arr1 = mutableListOf<Int>()
    arr1.add(5)

    // Method 2, here we're creating an 'ArrayList'
    val arr2 = arrayListOf<Int>()
    arr2.add(5)

    // Method 3, if we know the length
    val arr3 = arrayOfNulls<Int>(10) // Length of 'arr3' is 10
    arr3[0] = 5
    arr3[1] = 6
    arr3[2] = 7
    // ... and so on
}
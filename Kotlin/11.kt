import java.util.Arrays;
fun main() {
    val arr = arrayOf<Int>(1,2,4,5)
    val arr2 = arrayOf(6,7,8,9)
    println(arr.size) // Returns the size of the array.
    println(arr[0]) // Returns the element in the specified index, Method 1
    println(arr.get(0)) // Method 2
    println(Arrays.toString(arr)) // We cannot directly print an array.
    pritln(returnSizeVariance(arr,arr2))
}
fun returnSizeVariance(arr1:Array<Int>,arr2:Array<Int>):Boolean {
    return(arr1.size == arr2.size)
}
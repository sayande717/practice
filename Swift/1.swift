/* Swift is a statically typed language, which means that the data types of the variables are determined & fixed at compile time.
 *
 */

// Constants
let var1 = 10
let var2: Int = 20
// Variables
var sum = 0

// Functions
func add2NumbersV1(x:Int,y:Int) -> Int {
    return x+y
}

func add2NumbersV2(to x:Int, to y:Int) -> Int {
    return x+y
}


// Function calls
// V1: Mentioning x & y
print("Sum V1:",add2NumbersV1(x:var1,y:var2))
// V2: Without mentioning x & y
print("Sum V2:",add2NumbersV2(to: var1, to: var2))

// Using variables
sum=var1+var2
print("Sum:",sum)
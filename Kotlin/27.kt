// Data classes don't have/need { } unless we're defining secondary constructors in them.
data class Student(val name:String, val rollNo: Int, val marks:Int)

def main() {
    val studentOB = Student("ABCD",1234,90)
    // We can directly print the value of the object of a data class.
    println(studentOB)
}
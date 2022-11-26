var c = 5;

function func1()
{
    console.log('My first function!');
}

function func2(a,b)
{
    var d = 5; //Local variable
    console.log(a+b);
}

func1();
func2(10,5);
console.log(c); //Global variable
console.log(d); //Local variable, will result in an error.

//If both global and local variables have the same name i.e. c.
function func3()
{
    var c = 10;
    return c;
}
console.log(func3()); //Local variable in function func3() will take priority, since the function is being called.
console.log(c); //Global variable will take priority.
const age = 25

function myAge()
{
    //Here, the local variable 'age' takes priority.
    const age = 27
    console.log(age);
}

myAge()
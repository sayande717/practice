const myProfile = 
{
    'name': 'sayan',
    'age': 22
}

let val = 100

function modifyObject(obj)
{
    obj.age++
}

function modifyPrimitive(primitive)
{
    primitive++
}

//Here, the object parameter's value is modified.
// Call by reference takes place.
modifyObject(myProfile)
console.log(myProfile.age)

//Here, the object parameter's value is not modified.
//Call by value takes place.
modifyPrimitive(val)
console.log(val)
var ourDog = //Declaring an object - Method 1
{
    "name":"Camper",
    "legs":4,
    "ears":2,
    "friends":["everything"],
    "random property":"something" //Property with spaces
}
var myDog = {"name":"Camper 2","legs":4,"ears":2,"friends":["everything!"]} //Declaring an object, Method 2
//Both are same

//Accessing values of properties of objects
var leg = ourDog.legs //Method 1, when there are no spaces
console.log(leg);
var pr = ourDog["random property"] //Method 2, when there are spaces
console.log(pr);
console.log(ourDog.friends[0]);
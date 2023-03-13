// Binding this
const person = {
    name: 'Mosh',
    walk() {
        console.log(this);
    }
}

person.walk()
// functions in JS are objects
// With the bind method, we can set the value of 'this' permanently
const walk = person.walk.bind(person)
walk()
// Object
const person = {
    name: 'Mosh',
    // walk is a method in the object 'person'
    walk: function() {
        console.log(this);
    },
    // Also a method
    talk() {}
};

person.talk()

// Changing the value of a member
const targetMember = 'name'
person[targetMember] = 'John'

// If a function is called after creating an object, 'this' returns a reference to the object.
person.walk()
// If a function is called outside of an object, it returns the global object.
walk()
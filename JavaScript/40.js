const person = {
    name: 'Mosh',
    // walk is a method in the object 'person'
    walk: function() {
        return
    },
    // Also a method
    talk() {}
};

person.talk()

// Changing the value of a member
const targetMember = 'name'
person[targetMember] = 'John'
const array = [1,2,3,4,5,6]

// For even numbers
console.log(array.filter(element => element % 2 === 0))

// For odd numbers
console.log(array.filter(function (element) {
    return element % 2 !== 0
}))
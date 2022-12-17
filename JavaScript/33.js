const arr1 = [1,2,3]
const arr2 = [4,5,6]
//Destructuring arrays
// arr3 contains the elements from arr1 & arr2.
const arr3 = [...arr1,...arr2]
console.log(arr3);

//arr4 contains the arrays arr1 & arr2 (nested array).
const arr4 = [arr1,arr2]
console.log(arr4);

//Destructuring objects
const obj = {
    name: 'name1'
}
const obj2 = {
    age:22
}
const obj3 = {
    ...obj,
    ...obj2
}
console.log(obj3);
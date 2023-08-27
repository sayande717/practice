const array = [1,2,3,4,5,6,7,8]

/* array.map()
 * It does not change the original array.
 * The return statement returns the value to the array 'mappedArray'.
 */
const mappedArray = array.map(function(element) {
    console.log(element)
    return element ** 2
})
console.log(array,mappedArray);

/* array.filter()
 * Only display those elements which match the condition.
 */

const filteredArray = array.filter(element => element < 5)
console.log(array,filteredArray);

// array.find()
console.log('Position: ',array.find(element => 2)) 

// array.forEach()
// It's like a typical for(i=0;i<array.length;i++) loop
array.forEach(function(element) {
    console.log(element)
})
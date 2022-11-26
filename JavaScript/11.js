//push()
var arr = [1,2,3];
arr.push(4,5); // Pushes these values to the end of array arr.
console.log(arr);
arr.push([6,7]); //Pushes this array to the end of array arr.
console.log(arr);
//pop();
var rmfromarr = arr.pop(); //[4,5] is popped from the array and stored in the variable rmfromarr.
console.log(arr);
console.log(rmfromarr);
arr.pop(); //Standalone usage of pop().
console.log(arr);
//shift()
arr.shift(); //Removes ie 'Shifts off' the 1st element arr[0] from the array [1,2,3,4]
console.log(arr);
//unshift()
arr.unshift(10); //Appends the element in the beginning of the array [2,3,4]
console.log(arr);
/*
An array is a collection of various elements.
You can have elements of multiple data types in an array.
*/
var arr1 = [26,'hello'];
console.log(arr1[0]);
//Nested arrays
var arr2 = [[1,2,3],['hello',26],9.5];
console.log(arr2[0][1]);
console.log(arr2[2]);
//3-layer deep array
var arr3 = [[1,2,3],[4,5,6],[7,8,9],[[11,12,13],14,15]]
console.log(arr3[3][0][1]); //prints 12 of array [11,12,13]
function queue (arr,item)
{
    arr.push(item);
    return arr.shift();
}
arr = [1,2,3,4,5];
console.log('Test: '+arr); //Array is displayed.
console.log('Before: '+JSON.stringify(arr)); //Array converted to string, then displayed.
console.log('Item removed: '+queue(arr,6));
console.log('After: '+JSON.stringify(arr));
function checkAscendingArray(arr)
{
    return (arr[0] < arr[arr.length - 1])
}

function binarySearch(arr,numbertosearch)
{
    let start = 0
    let end = arr.length - 1
    //flag is true if array is in ascending order.
    const flag = checkAscendingArray(arr)
    while (start <= end)
    {
        
        let mid = Math.floor(start + (end - start) / 2);
        if(numbertosearch < arr[mid])
        {
            if(flag)
            {
                end = mid - 1
            }
            else
            {
                start = mid + 1
            }
            
        }
        else if (numbertosearch > arr[mid])
        {
            if (flag) 
            {
                start = mid + 1
            }
            else 
            {
                end = mid - 1
            }
        }
        else
        {
            return mid
        }
    }
    return -1
}

function main()
{
    const array1 = [2, 3, 4, 56, 67, 78] //Array in ascending order
    const array2 = [67, 65, 56, 43, 32, 22, 11] //Array in descending order
    const numtosearch = 67
    console.log('Position in ascending array: ',binarySearch(array1,numtosearch) + 1)
    console.log('Position in descending array: ', binarySearch(array2, numtosearch) + 1)
}

main()
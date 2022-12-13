function linearSearch(arr, numbertosearch)
{
    for (let index = 0; index < arr.length; index++) 
    {
        if (arr[index] == numbertosearch)
        {
            return index
        }
    }
    return -1
}

function main()
{
    const array = [3, 2, 4, 76, 21, 223, 777]
    console.log("Position: ", linearSearch(array, 76) + 1)
    console.log("Position: ", linearSearch(array, 999) + 1)
}

main()
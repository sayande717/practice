function test(a, b)
{
    // if(a == b) //"10" is converted to an integer for comparison
    //     return 'equal';
    // if (a === b) //No conversion takes place, === means strict equality.
    //     return 'equal';
    // return 'not equal';
}

function test2(a)
{
    // if (a != 17) 
    //     return 'not equal';
    if (a !== 17) //Strict inqeuality, no conversion takes place.
        return 'not equal';
    return 'equal';
}

console.log(test2("17"));
function fun(a) 
{
    //Return undefined if a < 0.
    if (a < 0)
        return undefined; // undefined == null
    else
        return Math.sqrt(a);    
}
console.log(fun(16));;
console.log(fun(-2));;
function isless(a, b)
{
    if(a < b)
        return true;
    else
        return false;
}
//Instead of this, we can just use return.
function isless2(a, b)
{
    return (a < b);
}
console.log(isless(4, 5));
console.log(isless2(6, 4));
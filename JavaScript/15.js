function isTrue(cond)
{
    if(cond) //If cond = true
        return true;
    else    //If cond = false
        return false;
}
var a = isTrue(true);
var b = isTrue(false);
console.log(a+' '+b);
function checkBoolean(value)
{
    if(!value)
    {
        return "Value is false"
    }
    else
    {
        return "Value is true."
    }
}
/* When we enter something other than a boolean, Java tried it's best to convert it to a boolean value.
 * <value> returns <true/false>
 * 0 -> false.
 * undefined -> false
 * null -> false
 * String -> true
 */
console.log(checkBoolean(null));
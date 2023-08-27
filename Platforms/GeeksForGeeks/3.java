// Q. https://practice.geeksforgeeks.org/problems/reverse-a-string/1

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String outStr = new String("");
        for(int index = str.length()-1;index>=0;index--) {
            outStr += Character.toString(str.charAt(index));
        }
        return outStr;
    }
}
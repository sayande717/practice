import java.util.Scanner;

class PalindromeString
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String strinput = new String(in.next());
        if(isPalindrome(strinput))
        {
            System.out.println("String is a palindrome.");
        }
        else
        {
            System.out.println("String is not a palindrome.");
        }
        in.close();
    }
    static boolean isPalindrome(String str)
    {
        String str1 = new String();
        for (int index = str.length()-1; index >= 0 ; index--) 
        {
            str1+=str.charAt(index);
        }
        return (str.equals(str1));
    }
}
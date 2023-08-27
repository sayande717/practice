// Q. https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

class Solution {
    int isPalindrome(String S) {
        int first,last;
        for(first=0,last=S.length()-1;first<last;first++,last--) {
            if(S.charAt(first) != S.charAt(last)) {
                return 0;
            }
        }
        return 1;
    }
};
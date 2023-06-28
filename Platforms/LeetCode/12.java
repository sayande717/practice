// 9. https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        String outNum = "";
        for(int index = num.length()-1;index>=0;index--) {
            outNum +=num.charAt(index);
        }
        return num.equals(outNum)?true:false;
    }
}
// Q. https://practice.geeksforgeeks.org/problems/multiply-two-strings/1

class Solution
{
    public String multiplyStrings(String s1,String s2) {
        long n1 = 0,n2 = 0;
        int index;
        HashMap<Character,Integer> database = new HashMap<>();
        database.put('0',0);
        database.put('1',1);
        database.put('2',2);
        database.put('3',3);
        database.put('4',4);
        database.put('5',5);
        database.put('6',6);
        database.put('7',7);
        database.put('8',8);
        database.put('9',9);
        database.put('-',0);
        
        boolean negate = false;
        if(s1.charAt(0) == '-' || s2.charAt(0) == '-') {
            negate = true;
        }
        
        for(index = 0;index<s1.length();index++) {
            n1 = n1*10+database.get(s1.charAt(index));
        }
        
        for(index = 0;index<s2.length();index++) {
            n2 = n2*10+database.get(s2.charAt(index));
        }
        
        if(negate) {
            return Long.toString(n1 * n2 * (-1));
        }
        return Long.toString(n1 * n2);
    }
}
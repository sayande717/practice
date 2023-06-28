// 1672. https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum=sum+accounts[i][j];
            }
            if(sum > maxwealth)
            {
                maxwealth = sum;
            }
        }
        return maxwealth;
    }
}
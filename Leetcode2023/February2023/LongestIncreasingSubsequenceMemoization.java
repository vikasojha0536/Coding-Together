
// Time complexity : O(N2)
// Space complexity : O(N2)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int [][] dp = new int[nums.length+1][nums.length+1];
           for(int i=0; i<nums.length; i++) {
             for(int j=0; j<nums.length; j++) {
                 dp[i][j] = -1;
           }
    }   
       return lengthOfLIS(0, -1, nums, nums.length, dp);      
}
    
    public int lengthOfLIS(int ind, int prev, int[] arr, int n, int [][] dp) {
        
        if(dp[ind][prev+1] != -1) {
            return dp[ind][prev+1];
        }
        if(ind == n) {
            return 0;
        }
        int len = lengthOfLIS(ind+1, prev, arr, n,dp);
        if(prev == -1 || arr[ind] > arr[prev] ) {
            len = Math.max(len, 1 + lengthOfLIS(ind+1, ind, arr, n, dp));
        }
        dp[ind][prev+1] = len;
        return len;
    }
}

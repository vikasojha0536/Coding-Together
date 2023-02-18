// Time complexity: O(n)
// Space complexity: O(n)
class Solution {
    public int climbStairs(int n) { 
    int dp[] = new int[n+1];
    Arrays.fill(dp,-1);
    return climb(n, dp);
   }

    private int climb(int n, int[] dp) {
        if(dp[n] != -1)
        return dp[n];
        if(n<=2)
        return n;
         dp[n] =  climb(n-1, dp) + climb(n-2, dp);
         return dp[n];
     }
}

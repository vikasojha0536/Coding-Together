// TC : O(n)
// SC : O(n)
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
         int dp[] = new int[n];
         Arrays.fill(dp,-1);
      return rob(nums, nums.length-1,dp);       
    }


    public int rob(int[] nums, int i, int[] dp) {
        if(i < 0)
          return 0;
        if(i == 0)
          return nums[i];
        if(dp[i] != -1)
          return dp[i];  
        int nt = rob(nums, i-1, dp);
          int  t =  nums[i] + rob(nums, i-2, dp);  
        dp[i] = Math.max(t, nt);  
        return dp[i];
    }
}

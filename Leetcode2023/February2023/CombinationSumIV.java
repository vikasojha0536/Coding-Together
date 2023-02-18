// TC: O(tn) where t is target and n is the size of nums
// SC: O(t) where t is target
class Solution {
    public int combinationSum4(int[] nums, int target) {
       int[] dp = new int[target+1];  
       dp[0] = 1;   
       return combinationSum(nums, target, dp);     
    }

      private int combinationSum(int[] nums, int target, int[] dp) {
            
          for(int i=1; i<=target; i++) {
               int count =0;
              for(int j=0; j<nums.length; j++) {
                  if(nums[j] <= i)
                  count = count + dp[i - nums[j]]; 
              }
                dp[i] = count; 
          }
          return dp[target];

    }
}

// TC: O(n)
// SC: O(1)

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
      
         return robspaceopt(nums);
    }
        public int robspaceopt(int[] nums) {
        int prev2 =0;
        int prev1 = nums[0];
        for(int i=1; i<nums.length; i++ ) {
            int take = nums[i];
            if(i > 1)
            take = take + prev2;
            int notake = prev1;
             int curr = Math.max(take, notake);
            prev2 =prev1;
            prev1 = curr;
        }  
        return prev1;
    }
}

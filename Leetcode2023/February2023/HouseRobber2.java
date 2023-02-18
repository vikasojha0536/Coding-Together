// TC : O(n)
// SC : O(1)
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length-2),
                       rob(nums, 1, nums.length-1));    
    }

     public int rob(int[] nums, int start, int end) {
        int prev2 = -1;
        int prev1 = nums[start];
        for(int i=start+1; i<=end; i++ ) {
            int take = nums[i];
            if(i > start+1)
            take = take + prev2;
            int notake = prev1;
            int curr = Math.max(take, notake);
            prev2 =prev1;
            prev1 = curr;
        }
        return prev1;       
    }
}

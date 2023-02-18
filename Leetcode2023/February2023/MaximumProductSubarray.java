// TC : O(n)
// SC : O(1)
class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];
        int maxhere = 1;
        int minhere =1;
        for(int i=0;i<nums.length; i++) {
            int temp = maxhere;
            maxhere = Math.max(nums[i], Math.max(nums[i]*minhere, nums[i]*maxhere) );
            minhere = Math.min(nums[i], Math.min(nums[i]*minhere, nums[i]*temp) );
            
            max = Math.max(max, maxhere);
        }
        return max;
    }
}

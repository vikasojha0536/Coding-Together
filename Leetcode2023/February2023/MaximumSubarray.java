// TC: O(n)
// SC: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
       int maxHere = nums[0];
        int currentSum = nums[0];
        for(int i=1; i< nums.length; i++) {
           
            if(currentSum < 0) {
                currentSum = 0;
            }
             currentSum = currentSum + nums[i];
             maxHere = Math.max(maxHere,currentSum);
        }
        
        return maxHere;
        
    }
}

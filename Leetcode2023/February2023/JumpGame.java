class Solution {
    // TC O(n)
    // SC O(1)
    public boolean canJump(int[] nums) {
        int n = nums.length -1;
        int goal = n;
        for(int i=n-1 ; i>=0; i--) {
            if(i+nums[i] >= goal){
                goal = i;
            }

        }
        if(goal == 0) {
            return true;
        }
        else{
            return false;
        }

    }
}
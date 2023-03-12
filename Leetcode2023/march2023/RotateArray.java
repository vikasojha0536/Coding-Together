// TC: O(n) where n is the length of nums
// SC: O(1) as no auxiliary space is used
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
      reverse(nums, 0, nums.length-k-1);
      reverse(nums, nums.length-k, nums.length-1);
      reverse(nums, 0, nums.length-1);
    }

    public void reverse(int[] nums, int left, int right) {
        if(nums.length > 1) {
        while(left <= right) { //TC :O(n)  SC: O(1)
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }
        }
     }
}

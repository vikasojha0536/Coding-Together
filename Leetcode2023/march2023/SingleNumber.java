// TC O(n) where n is size of nums
// SC O(1) as we are using only constant space with res
class Solution {
    public int singleNumber(int[] nums) {

        int res = 0;
        for(int num: nums) {
            res = res ^ num;
        }
        return res;
    }
}

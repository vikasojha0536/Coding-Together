// TC : O(n2)
// SC: O(n2)
class Solution {
    // TC O(n2)
    public  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length-2; i++) {
          if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            int temp = nums[i];
            int tar = 0 - nums[i];
           List<List<Integer>> twosum =  twoSum(nums, i+1, tar);
            for(List<Integer> list: twosum) {
                list.add(temp);
                res.add(list);
            }
        }
        return res;
        
        
    }
    
    List<List<Integer>> twoSum(int[] arr, int i, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int left = i;
        int right = arr.length - 1;
        while(left < right) {
                
        
  if(left != i && arr[left] == arr[left-1]) {
                left++;
                continue;
            }
            if(arr[left] + arr[right] == target) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[left]);
                list.add(arr[right]);
                res.add(list);
                right--;
                left++;
            }
            else if(arr[left] + arr[right] > target) {
               right--;  
            }
            else{
                left++;
            }
        }
        return res;
    }
}

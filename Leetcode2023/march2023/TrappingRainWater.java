//TC : O(n) where n is the length of the height array 
//SC: O(n) where n is the length of the height array
class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int res = 0;
        int max  =0;
        for(int i=0; i<height.length; i++) {
            max = Math.max(max, height[i]);
            left[i] = max; 
        }

        max  =0;
        for(int i=height.length-1; i>=0; i--) {
            max = Math.max(max, height[i]);
            right[i] = max; 
        }
        for(int i=0; i<height.length; i++) {
          int value = Math.min(left[i], right[i]) - height[i];
              res = res + value;          
        }
        return res;
    }
}

 // TC :O(n^2) where n is the size of the array
 // SC: O(n) where n is the size of the array
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
     return constructMaximumBinaryTree(nums, 0, nums.length-1);
    }
    private TreeNode constructMaximumBinaryTree(int[] arr, int i, int j) {
        if(i > j) {
            return null;
        }
        int maxindex = maxEle(arr, i, j);
        TreeNode root = new TreeNode(arr[maxindex]);
        root.left = constructMaximumBinaryTree(arr, i, maxindex-1);
        root.right = constructMaximumBinaryTree(arr, maxindex+1, j);
        return root;
    }
    
     private int maxEle(int[] arr, int i, int j) {
        int index = i;
        for(int start = i; start <=j; start++) {
            if(arr[index] < arr[start]) {
                index = start;
            }
        }
        return index;
    }
}

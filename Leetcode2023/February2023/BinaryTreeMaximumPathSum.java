//TC: O(n)
//SC: O(h) where h is the height of the tree
class Solution {
    int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

       maxSum(root);
       return sum;

        
    }
        public int maxSum(TreeNode root) {

        if(root == null) {
            return 0;
        }
        int l = Math.max(maxSum(root.left),0);
        int r = Math.max(maxSum(root.right),0);
        sum = Math.max(sum, l+r+root.val);
        return Math.max(l + root.val, r+root.val);

        
    }
}

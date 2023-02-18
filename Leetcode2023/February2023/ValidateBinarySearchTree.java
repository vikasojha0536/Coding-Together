// TC : O(n)
// SC : O(h) height of tree.
class Solution {
    
    public boolean isValidBST(TreeNode root) {
       return isValidBST1(root, Long.MIN_VALUE, Long.MAX_VALUE);     
    }


public boolean isValidBST1(TreeNode root, long left, long right) {
        
        if(root == null) {
            return true;
        }
        
        if(root.val >= right || root.val <= left) {
                return false;
        }
        return isValidBST1(root.left, left, root.val) 
        && isValidBST1(root.right, root.val, right);       
    }
}

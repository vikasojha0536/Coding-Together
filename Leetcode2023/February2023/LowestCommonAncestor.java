// Time complexity: O(n) worst case and O(logn) average case where n is the node in the tree.
// Space complexity: O(n) worst case and O(logn) average case where n is the node in the tree.
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        else {
            return root;
        }
        
    }
}

// Time complexity: O(n) where n is the number of nodes
// Space complexity: O(h) where h is the height of the tree
class Solution {
    public int maxDepth(TreeNode root) {
        return maxdepth(root);
    }
    int maxdepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(maxdepth(root.left), maxdepth(root.right));
    }
}

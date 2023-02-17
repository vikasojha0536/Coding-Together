// TC : O(n) As we travers all the nodes
// SC : best case O(logn) worst case: O(n) for skew tree
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
       
        
    }
    
    public void inorder(TreeNode root, List<Integer> list) {
         if(root == null) {
           return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}

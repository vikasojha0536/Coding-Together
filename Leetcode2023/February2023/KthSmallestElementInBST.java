// TC : O(n)
// SC : O(h) h is the height of the tree
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return  list.get(k-1);
        
    }

    void inorder(TreeNode root, List<Integer> list){
            if(root == null) {
                    return;
            }
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
    }
}

// Time complexity : O(n)
// space complexity : O(h) h is the height of the tree. Worst case O(n) skewed tree
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
         pathSum(root, targetSum, new ArrayList<>());
         return res;
    }

    public void pathSum(TreeNode root, int targetSum, List<Integer> list) {
        if(root == null) {
                return;
        }
        list.add(root.val);
        if(root.left == null && root.right == null && targetSum-root.val == 0){
            res.add(new ArrayList(list));
        } 
        pathSum(root.left, targetSum - root.val, list);
        pathSum(root.right, targetSum - root.val, list);
        list.remove(list.size()-1);
    }
}

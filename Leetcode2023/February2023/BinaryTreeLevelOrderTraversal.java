// TC: O(n)
// SC: O(n)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);
        if(root == null) {
            return res;
        }
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode tree = queue.peek();
                if(tree.left != null) queue.offer(tree.left);
                if(tree.right != null) queue.offer(tree.right);
                list.add(queue.poll().val);
            }
            res.add(list);
            
        }
        return res;
    }
}

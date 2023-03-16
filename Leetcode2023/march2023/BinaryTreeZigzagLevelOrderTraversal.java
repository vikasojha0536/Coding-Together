
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        if(root == null){
return res;
        }
        while(!q.isEmpty()) {
            int size  = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i =0; i<size;i++) {
            TreeNode node = q.peek();

           
            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right); 
            if(flag)
            list.add(q.poll().val);
            else
            list.add(0,q.poll().val);
        }
        res.add(list);
        flag = !flag;
        }
        return res;
    }
}

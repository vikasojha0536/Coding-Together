/*
Let NNN be the length of the input arrays.

Time complexity : O(N).

Building the hashmap takes O(N) time, as there are N nodes to add, and adding items to a hashmap has a cost of O(1),
so we get N⋅O(1)=O(N).

Building the tree also takes O(N) time. The recursive helper method has a cost of O(1) for each call (it has no loops),
and it is called once for each of the N nodes, giving a total of O(N).

Taking both into consideration, the time complexity is O(N).

Space complexity : O(N).

Building the hashmap and storing the entire tree each requires O(N) memory. The size of the implicit system stack used by recursion calls 
depends on the height of the tree, which is O(N) in the worst case and O(logN) on average. Taking both into consideration, the space complexity is O(N).
*/
class Solution {
      int preorderindex = 0;
      Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      
        map = new HashMap<>();
        for(int i=0; i<inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return bst(preorder, 0, preorder.length -1);
 
   }


   TreeNode bst(int[] preorder, int left, int right) {
     if(left > right) {
            return null;
     }

     int value = preorder[preorderindex++];
     TreeNode root = new TreeNode(value);
     root.left = bst(preorder, left, map.get(value) -1);
     root.right = bst(preorder, map.get(value) +1, right);
        return root;
   }
}

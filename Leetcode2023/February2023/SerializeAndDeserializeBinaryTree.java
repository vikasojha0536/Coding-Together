// TC will O(n). See video for explaination
// SC will O(n). See video for explaination
public class Codec {
    private static final String SPLITER = " ";
    private static final String NN = "#";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root, sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(SPLITER)));
        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> nodes) {
        String node = nodes.remove();
            if(node.equals(NN)) {
                return null;    
            }
            TreeNode treeNode = new TreeNode(Integer.valueOf(node));
            treeNode.left = buildTree(nodes);
            treeNode.right = buildTree(nodes);
            return treeNode;
    }

    private void traverse(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append(NN).append(SPLITER);
            return;
        }    
        sb.append(root.val).append(SPLITER);
        traverse(root.left, sb);
        traverse(root.right, sb);
    }
}

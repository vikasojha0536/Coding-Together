/**
 * BFS - Iterative
 *
 * Time Complexity: O(V + E)
 *
 * Space Complexity: O(V). Both Queue and HashMap will take O(V) space
 *
 * V = Number of nodes. E = Number of edges in the graph.
 */

class Solution {
    public Node cloneGraph(Node node) {
                if(node == null) {
                return node;
        }
        Map<Node, Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        Node newOg = new Node();
        newOg.val = node.val;
        map.put(node, newOg);
        while(!q.isEmpty()) {
            Node og = q.poll();
            for(Node child: og.neighbors) {
            if(!map.containsKey(child)) {
                Node newChild = new Node();
                newChild.val = child.val;
                 q.offer(child);
                map.put(child, newChild);
               
            }
           Node og1 = map.get(og);
           og1.neighbors.add(map.get(child));
            }
        }
        
        return map.get(node);
        
    }
}

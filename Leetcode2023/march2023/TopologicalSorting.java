// TC : O(V+E) where V is no of vertices and E is the number of edges
// SC : O(V) where V is no of vertices
class Solution {

   // BFS approach
   // Graph already represented in the form of adjacency list(adj)
    public void toplogicalSorting(int n, List<List<Integer>> adj) {
         int[] degree = new int[n];
         for(int i =0; i<n; i++) {
             for(int node: adj.get(i)) {
                degree[node]++;
             }
             
         }
         
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<degree.length; i++) {
            if(degree[i] == 0)
                q.add(i);
        }

        while(!q.isEmpty()) {
            int node = q.poll();
             System.out.println(node);
            for(int n: adj.get(node)) {
                    degree[n]--;
                   if(degree[n] == 0) {
                  q.add(n);
                   } 
            }
        }       
        
    }
}

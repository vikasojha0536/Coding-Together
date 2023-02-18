// Time complexity : O(V+E)
// Space complexity : O(V+E)
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         int[] visited = new int[numCourses];
      List<Integer>[] adj  = creategraph(numCourses, prerequisites);
        for(int i=0; i<numCourses; i++){
            if(visited[i] == 0) {
            if(isCyclic(i, visited, adj)){
              return false;  
            }
            }
        }
        return true;
        
    }
    
    boolean isCyclic(int i, int[] visited, List<Integer>[] adj) {
      visited[i] = 1;
        for(Integer value: adj[i]){
            if(visited[value] == 0) {
                if(isCyclic(value, visited, adj)){
                    return true;
                }
            }
            else if(visited[value] == 1) {
                return true;
            }
        }
        visited[i] = 2;
        return false;
    
    }
    
    List<Integer>[] creategraph(int numCourses, int[][] prerequisites) {
            List<Integer>[] adj = new ArrayList[numCourses];
             for(int i=0; i<numCourses; i++) {
                adj[i] = new ArrayList<>();
            }        
               for(int i=0; i<prerequisites.length; i++) {
                adj[prerequisites[i][0]].add(prerequisites[i][1]);
            }
        return adj;
    }
}

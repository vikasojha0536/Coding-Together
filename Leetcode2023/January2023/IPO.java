// Time complexity: O(nlogn). we perform O(n) operations with the priority queue, each in O(logn).
// Space complexity: O(n). The sorted array of projects and the priority queue take linear space.
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];

        int profit =0;
        for(int i=0; i<n; i++) {
            projects[i][0] = profits[i];
            projects[i][1] = capital[i];
        }
        Arrays.sort(projects, (a,b) -> a[1] -b[1]);// 0(nlogn)
        int i=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //o(n)
        while(k>0) {
            while(i<capital.length && projects[i][1] <= w ) {

                pq.add(projects[i][0]);
                i++;
            }
            if(pq.isEmpty()) {
                break; // nlogn
            }
            int front = pq.poll();
            w = w + front;


            k--;
        }
        return w;
    }
}

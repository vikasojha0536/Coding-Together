// Time complexity: O(nlogn)(for sorting) + O(n)(for loop)
// Space complexity: O(n)(for res array)
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new  ArrayList<>();
         // TC - O(nlogn) where n is the length of intervals
         Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        // TC - O(n) for n intervals
        for(int[] interval: intervals) {
            if(interval[0] <= end) {
                end = Math.max(interval[1], end);
            }
            else{
                res.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }
         res.add(new int[]{start, end});
              
       return  res.toArray(new int[0][]);
        
    }
}

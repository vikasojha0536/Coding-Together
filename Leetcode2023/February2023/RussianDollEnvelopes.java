// Time complexity : O(nlogn)
// Space complexity : O(n)
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a,b) -> {
            if(a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
         int[] dp = new int[envelopes.length];
       
        int len = 0;
        int idx = 0;
        for(int i = 0; i<envelopes.length; i++) {
         idx = Arrays.binarySearch(dp, 0, len, envelopes[i][1]);
           // System.out.println(idx);
         idx = idx < 0? -1 - idx: idx;
         dp[idx] = envelopes[i][1];
         if(idx == len) len++;
        }
         return len;   
    }
}

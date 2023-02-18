
// TC: O(nm)
// SC: O(mn)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
          int n = text1.length();
        int m = text2.length();
        int [][] dp = new  int[n][m];
        for(int i = 0; i< n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return longestCommonSubsequence(text1, n-1, text2, m-1, dp);
        
    }

     int longestCommonSubsequence(String text1, int index1, String text2, int index2, int[][] dp) {
          
          if(index1 < 0 || index2 < 0) {
                return 0;
          }
          if(dp[index1][index2] != -1) {
              return dp[index1][index2];
          }
         if(text1.charAt(index1) == text2.charAt(index2))
         return dp[index1][index2] = 1+longestCommonSubsequence(text1, index1-1, text2, index2-1, dp);
         else
         return  dp[index1][index2] = Math.max(longestCommonSubsequence(text1, index1-1, text2, index2, dp), longestCommonSubsequence(text1, index1, text2, index2-1, dp));

     }
}

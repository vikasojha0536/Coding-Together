// TC O(RXC)  where R is the row and C is col
// SC : O(1)
class Solution {
    public void rotate(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        for(int i=0; i<R; i++) {
            for(int j=i; j<C; j++) { 
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;      

            }
          
        }

         for(int i=0; i<R; i++) {
            for(int j=0; j<R/2; j++) {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[i][R-1-j];
              matrix[i][R-1-j] = temp;      

            }
          
        }
        
    }
}

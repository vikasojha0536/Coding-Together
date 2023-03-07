  // TC O(MxNx4L) L- lenbgth of the word M is row, N is col
  // SC O(L) l is the length of word
class Solution {

    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                boolean found = dfs(i, j, 0, word, board);
                if(found == true) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int i, int j, int k, String word, char[][] board) {
   if(i<0 || j <0
          || i>= board.length
          || j >= board[i].length
          || board[i][j] == '0'
          || board[i][j] != word.charAt(k)) {
            return false;
        }
        if(k == word.length()-1) {
            return true;
        }
        char ch = board[i][j];
        board[i][j] = '0';
        if(dfs(i+1, j, k+1, word, board)
           || dfs(i-1, j, k+1, word, board)
           || dfs(i, j+1, k+1, word, board)
           ||dfs(i, j-1, k+1, word, board)) {
            return true;
        }
         board[i][j] = ch;
         return false;
    }

}

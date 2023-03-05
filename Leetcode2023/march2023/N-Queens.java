// TC : O(n!)
// SC : O(n^2)
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n;j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> res =  new ArrayList<>();
        dfs(board, 0, res);
        return res;
    }


    void dfs(char[][] board, int col, List<List<String>> res) {

            if(col == board.length) {
                res.add(construct(board));
                return;
            }

            for(int i = 0; i < board.length; i++) {
                if(validate(board, i, col)) {
                    board[i][col] = 'Q';
                    dfs(board, col + 1, res);
                    board[i][col] = '.';
                }
            }
    }

    boolean validate(char[][] board, int row, int col) {
        for(int i=0; i<col; i++) {
            if(board[row][i] == 'Q'){
                return false;
            }
        }
        for(int i=row-1, j = col -1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row+1, j = col -1; i<board.length && j>=0; i++, j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
      
        return true;
    }

    List<String> construct(char[][] board) {
        List<String> list = new LinkedList<>();
        for(char[] b : board)
        list.add(new String(b));
        return list;
    }


}

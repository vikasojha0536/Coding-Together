// Time complexity : O(mxn) where m and n are the rows and columns of the grid
// space complexity : O(mxn) where m and n are the rows and columns of the grid
class Solution {
    public int numIslands(char[][] grid) {
        int count =0; // O(mxn)
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    numofislands(grid, i, j);
                }    
            }
        }
        return count;
        
    }

    void numofislands(char[][] grid, int i, int j) {
        if(i<0 || j <0 || i>= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        numofislands(grid, i+1, j);
        numofislands(grid, i-1, j);
        numofislands(grid, i, j+1);
        numofislands(grid, i, j-1);
    }
}

/**
 
Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. If there is no clear path, return -1.

A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:

All the visited cells of the path are 0.
All the adjacent cells of the path are 8-directionally connected (i.e., they are different and they share an edge or a corner).
The length of a clear path is the number of visited cells of this path.

 

Example 1:
Input: grid = [[0,1],[1,0]]
Output: 2

Example 2:
Input: grid = [[0,0,0],[1,1,0],[1,1,0]]
Output: 4
Example 3:

Input: grid = [[1,0,0],[1,1,0],[1,1,0]]
Output: -1
 */
 class Grid{
    int row, col, distance;
    Grid(int i, int j, int d){
        row = i;
        col = j;
        distance = d;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
    
        if(grid[0][0] == 1){
            return -1;
        }
        Queue<Grid> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Grid g = new Grid(0,0,1);
        queue.add(g);
        visited[0][0] = true;
        int[] rowIndexes = new int[]{-1,0,1};
        int[] colIndexes = new int[]{-1,0,1};
        while(!queue.isEmpty()){
            Grid currentGrid = queue.poll();
            if(currentGrid.row == grid.length-1 && currentGrid.col == grid[0].length-1){
                return currentGrid.distance;
            }

            for(int i = 0; i < rowIndexes.length; i++){
                for(int j = 0; j < colIndexes.length; j++){
                    int row = currentGrid.row + rowIndexes[i];
                    int col = currentGrid.col + colIndexes[j];
                    if(row >=0 && row<= grid.length-1 && col>=0 && col<= grid[0].length-1 && visited[row][col] ==false && grid[row][col] == 0){
                        visited[row][col] = true;
                        queue.add(new Grid(row, col, currentGrid.distance+1));
                    }
                }
            }
        }

        return -1;

        
    }
}
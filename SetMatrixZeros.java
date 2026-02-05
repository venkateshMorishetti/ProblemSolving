/**
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

    You must do it in place.
    
    Example 1:
        Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
        Output: [[1,0,1],[0,0,0],[1,0,1]]

    Example 2:
        Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

 */

        //time complexity - O(n*m)
        //space complexity - O(n*m)
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int cols = matrix[0].length;
        int rows = matrix.length;
        boolean[][] flag = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    flag[i][j] = true;
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(flag[i][j] == true){
                    //make enire row 0
                    System.out.println("i and j values are"+ i+"--"+j);
                    for(int k = 0; k < cols; k++){
                        matrix[i][k] = 0;
                    }
                    //make entire col 0
                    for(int p = 0; p < rows; p++){
                        matrix[p][j]= 0;
                    }
                }
            }
        }
    }
}
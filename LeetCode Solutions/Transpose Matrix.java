class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] arr = new int[c][r];
        int idx;
        int jdx;
        
        
        
        for(idx = 0; idx < c; idx++)
        {
            for(jdx = 0; jdx < r; jdx++)
            {
                arr[idx][jdx] = matrix[jdx][idx];
            } 
        }
        
        
        return arr;
        
    }
}
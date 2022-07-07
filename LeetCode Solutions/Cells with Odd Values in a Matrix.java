class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int idx;
        int jdx;
        int size = indices.length;
        int r;
        int c;
        int count = 0;
          
        
        for(idx = 0; idx < size; idx++)
        {
            r = indices[idx][0];
            c = indices[idx][1];
            for(jdx = 0; jdx < n; jdx++)
            {
                arr[r][jdx]++;
            }
            for(jdx = 0; jdx < m; jdx++)
            {
                arr[jdx][c]++;
            }
        }
        
        
        
        for(idx = 0; idx < m; idx++)
        {
            for(jdx = 0; jdx < n; jdx++)
            {
                if(arr[idx][jdx]%2 == 1)
                    count++;
            }
        }
        
        return count;
    }
}
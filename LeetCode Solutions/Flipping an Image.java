class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        int idx;
        int jdx;
        int lastIdx = size - 1;
        int temp;
        
        for(idx = 0; idx < size; idx++)
        {
            for(jdx = 0; jdx < size/2; jdx++)
            {
                temp = image[idx][jdx]; 
                image[idx][jdx] = image[idx][lastIdx - jdx];
                image[idx][lastIdx - jdx] = temp;
            }
        }
        
        
        
        for(idx = 0; idx < size; idx++)
        {
            for(jdx = 0; jdx < size; jdx++)
            {
                if(image[idx][jdx] == 0)
                    image[idx][jdx] = 1;
                else
                    image[idx][jdx] = 0;
        
            }
        }
        
        
        
        
        return image;
    }
}
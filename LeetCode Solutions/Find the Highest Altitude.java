class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int dist = 0;
        int idx;
        int size = gain.length;
        
        for(idx = 0; idx < size; idx++)
        {
            dist += gain[idx];
            if(max < dist)
                max = dist;
        }
        
        return max;
    }
}
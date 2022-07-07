class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int idx;
        int size = nums.length;
        
        
        
        for(idx = 0; idx < size; idx++)
        {
            if( ((int) Math.log10(nums[idx]) + 1) % 2 == 0)
                count++;
        }
        
        
        return count;
    
    }
}
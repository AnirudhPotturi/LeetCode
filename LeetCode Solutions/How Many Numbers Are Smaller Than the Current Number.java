class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       
        int size = nums.length;
        int idx; 
        int jdx;
        int[] sol = new int[size];
        
        for(idx = 0; idx < size; idx++)
        {
            for(jdx = 0; jdx < size; jdx++)
            {
                if(nums[idx] > nums[jdx])
                    sol[idx]++;
            }
        }
        return sol;
        
    }
}
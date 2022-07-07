class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        
        for(int idx = 0; idx < nums.length; idx++)
        {
            runningSum[idx] = 0;
            for(int innerIdx = 0; innerIdx <= idx; innerIdx++)
            {
                runningSum[idx] += nums[innerIdx];
            }
        }
        
        return runningSum;
    }
}
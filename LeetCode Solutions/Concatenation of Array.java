class Solution {
    public int[] getConcatenation(int[] nums) {
        int ansLen = nums.length;
        int[] ans = new int[ansLen * 2];
        
        for(int idx = 0; idx < ansLen; idx++)
        {
            ans[idx] = nums[idx];
            ans[idx + ansLen] = nums[idx];
        }
        
        return ans;
    }
}
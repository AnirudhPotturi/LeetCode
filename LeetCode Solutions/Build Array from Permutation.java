class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int len = 0; len < nums.length; len++)
        {
            ans[len] = nums[nums[len]];
        }
        return ans;
    }
}
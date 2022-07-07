class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x = 0;
        int y = n;
        int idx = 0;
        int[] ans = new int[nums.length];
        while(x != n)
        {
            ans[idx] = nums[x];
            x++;
            idx++;
            ans[idx] = nums[y];
            y++;
            idx++;
        }
        return ans;
    }
}
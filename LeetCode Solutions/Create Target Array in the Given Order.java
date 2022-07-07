class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int size = nums.length;
        
        int idx;
        
        ArrayList<Integer> target = new ArrayList<Integer>(size);
        
        int targetIdx;
        
        for(idx = 0; idx < size; idx++)
        {
            targetIdx = index[idx];
            target.add(targetIdx, nums[idx]);
            
        }
        
        int[] ans = new int[size];
        
        for(idx = 0; idx < size; idx++)
        {
            ans[idx] = target.get(idx);
        }
        
        
        return ans;
    }
}
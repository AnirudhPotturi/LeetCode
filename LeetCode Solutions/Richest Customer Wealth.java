class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int accWealth;
        
        for(int[] acc : accounts)
        {
            accWealth = 0;
            for(int val : acc)
            {
                accWealth += val;
            }
            
            if(accWealth > maxWealth)
            {
                maxWealth = accWealth;
            }
        }
        
        return maxWealth;
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int idx = 0; idx < candies.length; idx++)
        {
            if(candies[idx] > max)
            {
                max = candies[idx];
            }
        }
        
        List<Boolean> result = new ArrayList<Boolean>();
        
        for(int kid : candies)
        {
            if(kid + extraCandies >= max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        
        return result;
    }
}
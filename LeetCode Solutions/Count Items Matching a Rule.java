class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
        
        int count = 0;
        int idx;
        int size = items.size();
        int index = map.get(ruleKey);
        
        for(idx = 0; idx < size; idx++)
        {
            if(ruleValue.equals((items.get(idx)).get(index)) == true)
            {
                count = count + 1;
            }
                
        }
        
        return count;
    }
}
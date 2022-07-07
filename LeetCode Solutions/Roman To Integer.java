class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int idx = 0;
        int answer = 0;
        int curVal = 0;
        int prev = 0;
        switch(len)
        {
            case 0: return 0;
            case 1: return getValue(s.charAt(idx));
        }
        while(idx < len)
        {
            curVal = getValue(s.charAt(idx));
            answer += curVal;
            if(idx > 0)
            {
                if(curVal == 5 * prev || curVal == 10 * prev)
                {
                    answer -= 2 * prev;
                }
            }
            prev = getValue(s.charAt(idx));
            idx++;
        }
        return answer;
    }
    
    int getValue(char s)
    {
        switch(s)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    
}
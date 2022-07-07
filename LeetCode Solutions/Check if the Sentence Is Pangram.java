class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
            return false;
        
        int size = sentence.length();
        
        int idx;
        
        char ch;
        
        ArrayList<Character> alpha = new ArrayList<Character>();
        
        for(idx = 0; idx < size; idx++)
        {
            ch = sentence.charAt(idx);
            if(!alpha.contains(ch))
                alpha.add(ch);
        }
        
        if(alpha.size() == 26)
            return true;
        else
            return false;
    }
}
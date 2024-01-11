class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String h = s.substring(1,s.length()) + s.substring(0,s.length()-1);
        //h = h.substring(1,h.length()-1);
        return h.contains(s);
        
    }
}

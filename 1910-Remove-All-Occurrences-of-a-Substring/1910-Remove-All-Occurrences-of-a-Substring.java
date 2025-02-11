class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)) {
            int i = s.indexOf(part);
            s = s.substring(0, i) + s.substring(i + part.length());
        }
        return s;
        
    }
}

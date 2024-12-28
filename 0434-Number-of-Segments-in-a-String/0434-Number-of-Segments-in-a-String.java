class Solution {
    public int countSegments(String s) {
        String[] i = s.split(" ");
        int c = 0;
        for(String m : i) if(m.length() != 0)c++;
        return c;
        
    }
}

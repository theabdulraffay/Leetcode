class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0; 
        int j = 0;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        int n = s1.length;
        int m = t1.length;

        while(i < n && j < m) {
            if(s1[i] == t1[j]) {
                j++;
            }
            i++;
        }

        return m - j;
        
    }
}

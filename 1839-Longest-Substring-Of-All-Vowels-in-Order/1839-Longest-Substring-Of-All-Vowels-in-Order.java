class Solution {
    public int longestBeautifulSubstring(String word) {
        int max = 0;
        int count = 1;
        int ch = 1;
        for(int i = 1; i < word.length(); i++) {
            char c1 = word.charAt(i);
            char c2 = word.charAt(i - 1);
            if(c1 == c2) count++;
            else if(c1 > c2) {
                ch++;
                count++;
            } 
            else {
                count = 1;
                ch = 1;
            }

            if(ch == 5) max = Math.max(max, count);
        }
        return max;
        
    }
} 

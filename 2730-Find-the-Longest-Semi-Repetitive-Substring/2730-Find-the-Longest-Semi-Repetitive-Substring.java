class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int left = 0;
        int count = 0;
        int max = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) count++;
            while(count > 1) if(s.charAt(left++) == s.charAt(left)) count--;
            max = Math.max(max, i - left + 1);
        }
        return max + 1;
        
    }
}

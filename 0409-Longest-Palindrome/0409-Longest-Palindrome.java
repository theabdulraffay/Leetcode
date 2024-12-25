class Solution {
    public int longestPalindrome(String s) {
        int[] he = new int[122];
        for(char i : s.toCharArray()){
            he[i - 'A']++;
        }
        int c = 0;
        int ch = 0;
        for(int i : he) {
            if(i % 2 == 1) {
                if(ch == 0) c += i;
                else c += i - 1;
                ch = 1;
            } else c += i;
        }
        return c;
        
    }
}

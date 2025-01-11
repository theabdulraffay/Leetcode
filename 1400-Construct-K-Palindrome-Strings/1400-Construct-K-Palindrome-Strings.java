class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() <= k) return s.length() == k;
        int[] ch = new int[26];
        for(char i : s.toCharArray()) {
            ch[i - 'a']++;
        }
        int c = 0;
        int n = 0;
        for (int i : ch) {
            if (i % 2 == 0) c++;
            else n++;
        }

        return n <= k;
    }
}

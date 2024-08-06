class Solution {
    public int maximumLengthSubstring(String s) {
        int[] cnt = new int[26];

        int w = 0;
        int x = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
            w++;

            if (cnt[c - 'a'] > 2) {
                while (cnt[c - 'a'] > 2) {
                    cnt[s.charAt(x++) - 'a']--;
                    w--;
                }
            }

            res = Math.max(w, res);
        }

        return res;
    }
}

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c = 0, k = 0, l = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                c++;
                if (c > 2)
                    return false;
                else if (c == 1)
                    k = i;
                else
                    l = i;
            }

        }
        return s1.charAt(l) == s2.charAt(k) && s1.charAt(k) == s2.charAt(l);

    }
}

class Solution {
    public int longestMonotonicSubarray(int[] n) {
        int max = 1, lower= 1, right = 1;
        for (int i = 1; i < n.length; i++) {
            if (n[i] < n[i - 1]) {
                lower++;
                right = 1;
            } else if (n[i] > n[i - 1]) {
                right++;
                lower= 1;
            } else {
                lower= 1;
                right = 1;
            }
            max = Math.max(max, Math.max(lower, right));
        }
        return max;

    }
}

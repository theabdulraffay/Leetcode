class Solution {
    int helper(int n, int m, HashSet set) {
        int c = 2;
        while (set.contains(n + m)) {
            c++;
            int t = n + m;
            n = m;
            m = t;
        }
        return c;
    }

    public int lenLongestFibSubseq(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) set.add(arr[i]);

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                max = Math.max(max, helper(arr[i], arr[j], set));
            }
        }
        return max == 2 ? 0 : max;
    }
}

class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, int[]> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new int[] { i, i });
            } else {
                map.get(c)[1] = i;
            }
        }
        int count = 0;

        for (char c : map.keySet()) {
            int[] t = map.get(c);
            HashSet<Character> set = new HashSet<>();
            for (int i = t[0] + 1; i < t[1]; i++) {
                set.add(s.charAt(i));
            }
            count += set.size();
        }
        return count;

    }
}

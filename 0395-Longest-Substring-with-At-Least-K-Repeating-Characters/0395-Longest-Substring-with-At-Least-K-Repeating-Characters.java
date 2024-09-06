class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() == 0 || s.length() < k) return 0;
        int[] count = new int[26];
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int max = 0;

        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }
        // System.out.println(Arrays.toString(count));
        for(int i = 0; i < 26; i++) {
            if(count[i] != 0 && count[i] < k) set.add((char)(i + 97));
        }
        if(set.isEmpty()) return s.length();
        // System.out.println(s.substring(0, 1) + "fsj");

        // HashMap<Character, Integer> map = new HashMap<>();
        int startIndex = 0;
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                max = Math.max(max, longestSubstring(s.substring(startIndex, i), k));
                startIndex = i + 1;
            }
            // else max = Math.max(max, i - startIndex + 1);
        }
        max = Math.max(max, longestSubstring(s.substring(startIndex, s.length()), k));

        return max;
        
    }
}

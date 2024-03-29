class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if(!set.contains(t)) {
                max = Math.max(max, i - left + 1);
            }
            else {
                while (set.contains(t))
                {set.remove(s.charAt(left++));}
            }
            set.add(t);
        }
        return max;
        
    }
}

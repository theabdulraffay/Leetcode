class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> map = new HashMap<>();
        int right = 0;
        for(int i = minSize; i <= s.length(); i++) {
            String x = s.substring(right++, i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = 0;
        for(String x : map.keySet()) {
            if(map.get(x) > max && checkCharacter(x, maxLetters)) {
                max = map.get(x);
            }
        }
        return max;
    }

    boolean checkCharacter(String s, int n) {
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size() <= n;
    }
}

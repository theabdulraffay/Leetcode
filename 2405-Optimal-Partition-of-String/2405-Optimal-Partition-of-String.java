class Solution {
    public int partitionString(String s) {
        int len = s.length(), result = 1;
        HashSet<Character> set = new HashSet<>();
        for (char i : s.toCharArray()) {
            if (set.contains(i)) {
                result++;
                set.clear();
            }
            set.add(i);
        }
        return result;
        
    }
}

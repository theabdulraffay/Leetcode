class Solution {
    void addAll(HashSet set, String s) {
        for(char i : s.toCharArray()) set.add(i);
    }
    void remove(HashSet set, String s) {
        for(char i : s.toCharArray()) set.remove(i);
    }

    int helper(List<String> arr, int index, HashSet set) {
        if(index == arr.size()) return set.size();
        int max = -1;
        for(int i = index; i < arr.size(); i++) {
            String s = arr.get(i);
            if(!contains(set, s)) {
                addAll(set, s);
                int t = helper(arr, i + 1, set);
                remove(set, s);
                max = Math.max(max, t);
            }
        }
        return max == -1 ? set.size() : max;
    }
    public int maxLength(List<String> arr) {
        return helper(arr, 0, new HashSet<Character>());
    }
}

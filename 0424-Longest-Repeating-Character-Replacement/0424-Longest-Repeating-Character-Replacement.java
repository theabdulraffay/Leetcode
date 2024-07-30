class Solution {
    int helper(String s, int k, char c) { // for every character we check the maximun length of substring with atmost k replacement of characters, 
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) != c) {
                list.add(i);
            }
        }
        list.add(s.length());
        if(list.size() <= k) return s.length();

        max = Math.max(max, list.get(k));
        for(int i = k + 1; i < list.size(); i++) {
            int num = list.get(i) - (list.get(i - k - 1) + 1);
            max = Math.max(max, num);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            set.add(c);
        }
        List<Character> arr = new ArrayList<>(set);
        int max = 0;
        for(char c : arr) {
            int n = helper(s, k, c);
            max = Math.max(max, n);

        }
        return max;
        
    }
}

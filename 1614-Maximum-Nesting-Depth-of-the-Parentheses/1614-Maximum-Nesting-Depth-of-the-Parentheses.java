class Solution {
    public int maxDepth(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                right++;
            }
            int sum = left - right;
            max = Math.max(max, sum);
        }
        return max;
        
    }
}

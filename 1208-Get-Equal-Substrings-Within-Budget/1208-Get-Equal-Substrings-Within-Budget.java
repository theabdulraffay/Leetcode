class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int cost = 0;
        char[] str = s.toCharArray();
        char[] ttr = t.toCharArray();
        int max = 0;

        for(int i = 0; i < str.length; i++) {
            cost += Math.abs(str[i] - ttr[i]);
            while(cost > maxCost) {
                cost -= Math.abs(str[left] - ttr[left]);
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
        
    }
}

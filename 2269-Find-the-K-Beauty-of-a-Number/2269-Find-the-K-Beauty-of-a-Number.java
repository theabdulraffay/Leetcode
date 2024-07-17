class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = String.valueOf(num);
        for(int i = k; i <= s.length(); i++) {
            int n = Integer.parseInt(s.substring(i - k, i));
            if(n == 0) continue;
            if(num % n == 0) count++;

        }
        return count;
        
    }
}

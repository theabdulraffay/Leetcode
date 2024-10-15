class Solution {
    public long minimumSteps(String s) {
        long total = 0;
        long zero = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '0') {
                zero++;
            } else {
                total += zero;
            }
        }
        return total;
        
    }
}

class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        boolean cond = true;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i += k) {
            StringBuilder sn = new StringBuilder(s.substring(i, i + k <= n ? i + k : n));
            if(cond) sb.append(sn.reverse());
            else sb.append(sn);
            cond = !cond;
        }
        return sb.toString();
        
    }
}

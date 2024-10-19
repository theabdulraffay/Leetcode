class Solution {
    String help(int n, int k) {
        if(n == 1) return "0";
        if(k == n/2) return "1";
        String temp = help(n - 1, k);
        StringBuilder sb = new StringBuilder();
        sb.append(temp);
        sb.append('1');
        for(int i = temp.length() - 1; i >= 0; i--) {
            if(temp.charAt(i) == '0') sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        while(Math.pow(2, n) - 1 >= k) n--;

        return help(n + 1, k).charAt(k - 1);
        
    }
}

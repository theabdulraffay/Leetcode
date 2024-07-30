class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int a = 0;
        int b = 0;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'b') {
                dp[i] = 1;
                b++;
            }
        }
        
        if(b == n) return 0;
        int min = n;
        min = Math.min(min, n - (a + b));
        for(int i : dp) {
            if(i == 0) a++;
            else b--;
            min = Math.min(min, n - (a + b));
        }
        return min;

        // int a = 0;
        // int b = 0;
        // for(char c : s.toCharArray()) if(c == 'b') b++;

        // int n = s.length();
        // if(b == n) return 0;
        // int min = n;
        // min = Math.min(min, n - (a + b));
        // for(char c : s.toCharArray()) {
        //     if(c == 'a') a++;
        //     else b--;
        //     min = Math.min(min, n - (a + b));
        // }
        // return min;
        
    }
}

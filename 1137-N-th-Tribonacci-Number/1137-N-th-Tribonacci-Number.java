class Solution {
    public int tribonacci(int n) {
        // if (n < 2) return n;
        // if (n == 2) return 1;
        // return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);

        int[] f = new int[38];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 0; i < 35; i++) {
            f[i+3] = f[i] + f[i+1] + f[i+2];
        }
        return f[n];
        
    }
}

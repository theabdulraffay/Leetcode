class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        boolean odd = true;
        int fir = 0;
        long sec = 0;
        long sum = 0;
        long toret = 0;
        int MOD = 1000000007;
        for (int i = n - 1; i >= 0; i--) {
            if((arr[i] & 1) == 1) {
                if(odd) {
                    fir = (fir + n - i) % MOD;
                    sum = fir;
                } else {
                    sec = (sec + n - i) % MOD;
                    sum = sec;
                }
                odd = !odd;
                n = i;
            }
            toret += sum;
        }
        return (int)(toret % MOD);
    }
}

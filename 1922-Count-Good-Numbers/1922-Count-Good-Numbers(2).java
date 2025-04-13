class Solution {
    int e = 1000000007;
    long mod(long base,long exponent,int mod)
    {
        long result = 1;
        base %= mod;
        while (exponent > 0){
            if ((exponent & 1) ==  1){
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        // long m = n((n+1)/2, 5);
        // long p = n((n)/2, 4);
        // long[] m = n(n/2, 5, 4);
        return (int)((mod(5, (n+1)/2, e) * mod(4, (n)/2, e)) % e);
        
    }
}

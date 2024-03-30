class Solution {
    int mod=(int)1e9+7;
    long helper(long x, long n) {
        if(n == 1)return x;
        if (n == 0)return 1;
        if(n % 2 == 0) {
            long temp = (helper(x, n/2)) % mod;
            return temp * temp;
        } else {
            long temp = (helper(x, n/2)) % mod;
            return temp * temp * x;
        }
    }
    public int countGoodNumbers (long n) {
        long first = ((n % 2 == 1) ? (n / 2) + 1 : n / 2);
        long second = n / 2;
        long ans = helper(5, first) % mod;
        ans = ans % mod;
        if (second != 0) {
            ans *= helper(4, second) % mod;
            ans = ans % mod;
        }
        return (int)ans;
        
    }
}

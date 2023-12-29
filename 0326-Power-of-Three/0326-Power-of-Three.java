class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 1 || n%2 == 0)return false;
        while(n > 1 && n % 3 == 0)
            n /= 3;
        return ((n == 1)? true:false);
    }
}

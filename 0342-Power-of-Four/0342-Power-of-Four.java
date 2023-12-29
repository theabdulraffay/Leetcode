class Solution {
    public boolean isPowerOfFour(int n) {
        // if(n > 0 && (n &(n-1)) == 0)
        //     if((n-1)%3 == 0)
        //         return true;

        // return false;
        if(n == 1)return true;
        if(n < 1 || n%2 == 1)return false;
        while(n > 1 && n % 4 == 0)
            n /= 4;
        return ((n == 1)? true:false);
        
    }
}

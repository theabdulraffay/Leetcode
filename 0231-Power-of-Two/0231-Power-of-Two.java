class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n-1) == 0;
        // if(n == 1) return true;
        // if(n % 2 == 1 || n <= 0 )
        //     return false;
        // while(n > 1){
        //     if(n % 2 == 1)
        //         return false;
        //     n /= 2;

        // }
        // return true;
        


    }
}

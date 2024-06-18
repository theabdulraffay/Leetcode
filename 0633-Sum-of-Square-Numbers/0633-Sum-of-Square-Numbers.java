class Solution {
    // boolean isPerf(int n) {
    //     int r = (int)Math.sqrt(n);
    //     return r * r == n;
    // }
    public boolean judgeSquareSum(int c) {
        long st = 0;
        long en = (long)Math.sqrt(c);
        while(st <= en) {
            long t = st * st + en * en;
            if(t == c) return true;
            else if (t > c) en--;
            else st++;
        }
        return false;
        // if(isPerf(c) || isPerf(c - 1)) {
        //     return true;
        // }
        // int st = 1;
        // while(st < c) {
        //     int te = c - (int)Math.pow(st++, 2);
        //     if(te < 0) { break; }
        //     if(isPerf(te)) { return true; }
        // }
        // return false;
        
    }
}

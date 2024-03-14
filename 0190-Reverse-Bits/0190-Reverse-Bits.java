public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int a = 0;

        for (int i = 0; i < 32; i++) {
            a <<= 1;
            a = a + (n&1);
            n >>= 1;
        }
        return a;
        
    }
}

class Solution {
    public int minimizeXor(int num1, int num2) {
        int bits = Integer.bitCount(num2);
        int n1 = Integer.bitCount(num1);

        int result = 0;
        for (int i = 31; i >= 0 && bits > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                // result |= (1 << i);
                result += Math.pow(2, i);
                bits--;
            }
        }
        for (int i = 0; i < 32 && bits > 0; i++) {
            if ((result & (1 << i)) == 0) {
                // result |= (1 << i);
                result += Math.pow(2, i);

                bits--;
            }
        }
        return result;

        
    }
}

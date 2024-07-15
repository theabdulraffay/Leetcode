class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k == 0) {
            return new int[code.length];
        }
        int[] ans = new int[code.length];

        if(k > 0) {
            int sum = 0;
            for(int i  = 0; i < k; i++) {
                sum += code[i];
            }

            for(int i = code.length - 1; i >= 0; i--) {
                ans[i] = sum;
                sum -= code[--k];
                sum += code[i];
                if(k == 0) {
                    k = code.length;
                }
                

            }
        } else {
            int sum = 0;
            for(int i = k; i < 0; i++) {
                sum += code[code.length  + i];
            }

            for(int i = 0 ; i < code.length; i++) {
                int n = code[(code.length + k + i) % code.length];
                ans[i] = sum;
                sum = sum - n;
                sum += code[i];
            }
        }
        return ans;        
    }
}

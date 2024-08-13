class Solution {
    int[] neg = new int[51];
    int smallest;
    int value() {
        int x = 0;
        for(int i = 0; i <= 49; i++) {
            if(neg[i] > 0) x += neg[i];

            if(x >= smallest) return i - 50;
        }
        return 0;
    }
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        for(int j = 0; j < k; j++) {
            int t = nums[j];
            if(t < 0)neg[t + 50]++;
        }

        int n = nums.length;
        smallest = x;
        int j = 0;
        int[] toret = new int[n - k + 1];

        for(int i = k - 1; i < nums.length; i++) {
            toret[j++] = value();
            int l = nums[i - k + 1];
            if(l < 0)neg[l + 50]--;
            
            if(i < nums.length - 1) {
                int t = nums[i + 1];
                if(t < 0)
                neg[t + 50]++;
            }
        }
        return toret;



        
    }
}

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int window = k*2 + 1;
        int n = nums.length;
        int[] toret = new int[n];
        Arrays.fill(toret, -1);
        if(n < window) return toret;

        long sum = 0;
        int left = 0;
        for(int i = 0; i < window; i++) {
            sum += nums[i];
        }
        for(int i = k; i < n - k; i++) {
            toret[i] = (int)(sum/window);
            sum -= nums[i - k];
            if(i < n - k - 1)sum += nums[i + k + 1];
        }
        return toret;
        

        
    }
}

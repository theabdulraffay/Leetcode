class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int k = (int) Math.pow(2, maximumBit) - 1, n = nums.length;
        int ans[] = new int[n];
        for(int i = 0; i<n; i++){
            k ^= nums[i];
            ans[n - 1 - i] = k;
        }
        return ans;
    }
}

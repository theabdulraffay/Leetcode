class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], nums[i - 1]);
            right[n - i - 1] = Math.max(right[n - i], nums[n -i]);
        }
        long max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, (left[i] - nums[i]) * (long)(right[i]));
        }
        return max;
        
    }
}

class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max = 0;
        int left = 0;
        int used = 0;
        for(int i = 0; i < nums.length; i++) {
            while((used & nums[i]) != 0) {
                used ^= nums[left++];
            }
            used |= nums[i];
            max = Math.max(max, i - left + 1);
        }
        return max;
        
    }
}

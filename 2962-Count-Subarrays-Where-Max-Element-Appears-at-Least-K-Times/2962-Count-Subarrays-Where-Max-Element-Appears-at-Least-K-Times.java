class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = nums[0];
        for(int i : nums) max = Math.max(max, i);
        int c = 0;
        long toret = 0;
        int left = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] == max) c++;
            while (c >= k) {
                toret += (n - i);
                if(nums[left++] == max) c--;
            }
        }
        return toret;
    }
}

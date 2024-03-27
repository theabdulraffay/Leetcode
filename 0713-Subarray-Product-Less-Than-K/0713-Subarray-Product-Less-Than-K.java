class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int prod = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (prod < k) { count++; }
                else { break; }
                prod *= nums[j];
            }
            if (prod < k) { count++; }
        }
        return count;
    }
}

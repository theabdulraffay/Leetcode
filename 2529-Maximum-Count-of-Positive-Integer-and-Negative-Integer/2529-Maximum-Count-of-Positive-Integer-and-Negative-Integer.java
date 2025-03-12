class Solution {
    int helper(int[] nums, int t) {
        int i = nums.length, st = 0, en = nums.length - 1;

        while(st <= en) {
            int m = (st + en) /2;
            if(nums[m] < t) st = m + 1;
            else {
                i = m;
                en = m - 1;
            }
        }
        return i;

    }
    public int maximumCount(int[] nums) {
        return Math.max(helper(nums, 0), nums.length - helper(nums, 1));
    }
}

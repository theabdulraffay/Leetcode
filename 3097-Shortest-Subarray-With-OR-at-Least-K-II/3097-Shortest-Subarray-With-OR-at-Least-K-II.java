class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {

        int left = 0;
        int min = nums.length + 1;
        int or = 0;
        int[] count = new int[32];

        for (int i = 0; i < nums.length; i++) {
            addbit(count, nums[i], 1);
            while (left <= i && count(count) >= k) {
                min = Math.min(min, i - left + 1);
                addbit(count, nums[left], -1);
                left++;
            }
        }
        return min == nums.length + 1 ? -1 : min;
    }

    public void addbit(int count[], int num, int val) {
        for (int i = 0; i < 32; i++) {
            if (((num >> i) & 1) == 1)
                count[i] += val;
        }
    }

    int count(int[] count) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (count[i] > 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}

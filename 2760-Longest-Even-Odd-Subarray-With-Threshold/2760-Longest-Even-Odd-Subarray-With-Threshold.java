class Solution {
    public int longestAlternatingSubarray(int[] nums, int x) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0 && nums[i] <= x) {
                int cnt = 1;
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] % 2 != nums[j - 1] % 2 && nums[j] <= x) {
                        cnt++;
                    } else {
                        break;
                    }
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}

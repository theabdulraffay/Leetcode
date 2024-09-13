class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int count = 0;
        int st = 1;
        int n = nums.length;
        int[] toret = new int[n - k + 1];
        int num = nums[0];
        for (int i = 1; i < k; i++) {
            if (nums[i] == num + 1) {
                num++;
                st++;
            } else {
                st = 1;
                num = nums[i];
            }
        }
        for (int i = k; i <= n; i++) {
            if (st >= k) {
                toret[i - k] = nums[i - 1];
            } else {
                toret[i - k] = -1;
            }

            if (i < n) {
                if (nums[i] == num + 1) {
                    num++;
                    st++;
                } else {
                    st = 1;
                    num = nums[i];
                }
            }
        }
        return toret;

    }
}

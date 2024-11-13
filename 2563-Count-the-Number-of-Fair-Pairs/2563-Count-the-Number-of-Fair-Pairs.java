class Solution {
    int find(int[] nums, int x, int st, int en, boolean t) {
        while(st < en) {
            int mid = st + (en -st) / 2;
            if(t) { // for lower bound
                if(nums[mid] >= x) en = mid;
                else st = mid + 1;
            }
            if(!t) { // for upper bound
                if(nums[mid] > x) en = mid;
                else st = mid + 1;
            }
        }
        return st;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long c = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] + nums[n-1] < lower) continue;
            int min = find(nums, lower - nums[i], i + 1, n, true);
            int max = find(nums, upper - nums[i], i + 1, n, false);
             c += (max - min );
        }
        return c;

    }
}

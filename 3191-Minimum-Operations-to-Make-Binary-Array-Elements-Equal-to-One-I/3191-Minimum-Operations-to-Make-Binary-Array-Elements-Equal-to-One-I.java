class Solution {
    public int minOperations(int[] nums) {

        int c = 0, n = nums.length;
        for(int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                c++;
                for(int j = i; j < i + 3; j++) {
                    nums[j] = 1 - nums[j];
                }
            }
        }

        return (nums[n - 1] == 0 || nums[n - 2] == 0) ? -1 : c;
        
    }
}

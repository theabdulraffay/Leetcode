class Solution {
    public boolean canJump(int[] nums) {
        int din = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= din) din = i;
        }
        return din == 0;
        
    }
}

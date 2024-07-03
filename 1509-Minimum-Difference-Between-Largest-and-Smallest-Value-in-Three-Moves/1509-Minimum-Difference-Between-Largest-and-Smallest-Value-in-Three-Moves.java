class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <= 3) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= 3; i++) {
            int n = nums[nums.length - 1 - i] - nums[3 - i];
            min = Math.min(n, min);
        }
        return min;
        
    }
}

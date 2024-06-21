class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums.length/2;
        int sum = 0;
        for(int i : nums) {
            sum += Math.abs(i - nums[median]);
        }
        return sum;
        
    }
}

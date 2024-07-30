class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int left = 0;
        int min = nums.length;
        while(i < nums.length && sum < target) {
            sum += nums[i++];
        } 
        if(sum < target) return 0;
        min = Math.min(min, i);

        while(i < nums.length) {

            while(sum >= target) {
                min = Math.min(min, i - left);
                sum -= nums[left++];
            }

            sum += nums[i++];
        }
        
        while(sum >= target) {
            min = Math.min(min, i - left);
            sum -= nums[left++];
        }

        return min;
    }
}

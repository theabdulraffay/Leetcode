class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for(int i  : nums) sum += i;
        long r = 0;
        int c = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            r += nums[i];
            sum -= nums[i];
            if(r >= sum) c++;
        }
        return c;
        
    }
}

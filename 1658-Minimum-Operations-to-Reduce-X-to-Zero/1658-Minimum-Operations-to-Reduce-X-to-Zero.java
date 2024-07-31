class Solution {
    public int minOperations(int[] nums, int x) {
        int tsum = 0;
        for(int i : nums) tsum += i;
        if(tsum < x) return -1;
        int i = 0; 
        int left = 0;
        int sum = 0;
        int max = -1;
        int tofind = tsum - x;
        while(i < nums.length && sum < tofind){
            sum += nums[i++];
        } 
        if(sum == x) max = Math.max(max, i);

        while(i <= nums.length) {
            while(sum > tofind) {
                sum -= nums[left++];
            }
            if(sum == tofind) max = Math.max(max, i - left);
            if(i < nums.length)sum += nums[i];
            i++;
        }
        return max == -1 ? -1 : nums.length - max;

        
    }
}

class Solution {
    public boolean isMonotonic(int[] nums) {
        int c = 1;
        int m = nums.length - 1;
        for(int i = 0;i<nums.length - 1;i++){
            if(nums[i] >= nums[i+1])c++;
            if(nums[i] <= nums[i+1] )m--;
        }
        return (c == nums.length || m == 0);
        
    }
}

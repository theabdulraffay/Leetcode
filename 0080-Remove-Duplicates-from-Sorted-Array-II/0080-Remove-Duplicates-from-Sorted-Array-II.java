class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for(int i = nums.length-1;i > 1;i--){
            if(nums[i] == nums[i-2]){
                nums[i] = Integer.MAX_VALUE;
                k--;
            }
        }
        Arrays.sort(nums);
        return k;
        
    }
}

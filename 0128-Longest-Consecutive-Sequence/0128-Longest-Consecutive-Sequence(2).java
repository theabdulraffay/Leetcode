class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int c = 1;
        int max = 0;
        int i = 1;
        while(i < nums.length) {
            if(nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            if(nums[i] - nums[i - 1] == 1) c++;
            else {
                max = Math.max(max, c);
                c = 1;
            }
            i++;
        }
        return Math.max(max, c);       
    }
}

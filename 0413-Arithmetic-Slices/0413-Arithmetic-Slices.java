class Solution {
    int total(int n) {
        return ((n) * (n + 1)) / 2;
    }
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;
        int count = 1;
        int diff = nums[1] - nums[0];
        int toret = 0;
        for (int i = 2; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == diff) {
                count++;
            } else {
                if(count >= 2) toret += total(count - 1);
                diff = nums[i] - nums[i - 1];
                count = 1;
            }
        } 
        if(count >= 2) toret += total(count - 1);
        return toret;
        
    }
}

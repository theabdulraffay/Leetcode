class Solution {
    public boolean check(int[] nums) {
        int c = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) c++;
        }
        return c < 2; 
        
    }
}

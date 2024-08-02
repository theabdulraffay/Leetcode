class Solution {
    public int minSwaps(int[] nums) {
        int k = 0; 
        for (int num : nums) if (num == 1) k++;
        int zeroCount = 0;
        for (int i = 0; i < k; i++) {
            if (nums[i] == 0) zeroCount++;
        }
        
        int minSwaps = zeroCount;
        
        for (int i = k; i < nums.length + k; i++) {
            if (nums[i % nums.length] == 0) zeroCount++;
            if (nums[(i - k) % nums.length] == 0) zeroCount--;
            
            minSwaps = Math.min(minSwaps, zeroCount);
        }
        
        return minSwaps;
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for(int i : nums)prod *= i;
        if(prod > 0)return prod;
        prod = 1;
        for(int i = 0;i<n; i++) {
            prod = nums[i];
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, prod);
                prod *= nums[j];
            }
            max = Math.max(max, prod);
        }
        return max;
        
    }
}

class Solution {
    Integer[] dp;
    Integer helper(int[] arr,int start, int ind) {
        if(start == arr.length - 1) return 0;
        if(start >= arr.length || arr[start] == 0) return null;
        if(dp[start] != null) return dp[start];
        int min = arr.length + 1;
        for(int i = start + 1; i < arr.length && i <= start + ind; i++) {
            Integer temp = helper(arr, i, arr[i]);
            if(temp != null) min = Math.min(min, temp);
        }
        dp[start] = min + 1;
        return dp[start];

    }
    public int jump(int[] nums) {
        if(nums.length == 1) return 0; 
        int n = nums.length;
        dp = new Integer[n];
        return helper(nums, 0, nums[0]);
    }
}

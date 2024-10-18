class Solution {
    // Integer[] dp;
    // Integer helper(int[] arr,int start, int ind) {
    //     if(start == arr.length - 1) return 0;
    //     if(start >= arr.length || arr[start] == 0) return null;
    //     if(dp[start] != null) return dp[start];
    //     int min = arr.length + 1;
    //     for(int i = start + 1; i < arr.length && i <= start + ind; i++) {
    //         Integer temp = helper(arr, i, arr[i]);
    //         if(temp != null) min = Math.min(min, temp);
    //     }
    //     dp[start] = min + 1;
    //     return dp[start];

    // }
    int ans = 0;
    public int jump(int[] nums) {
        // if(nums.length == 1) return 0; 
        // int n = nums.length;
        // dp = new Integer[n];
        // return helper(nums, 0, nums[0]);
        int i = 0;
        while(i < nums.length - 1) {
            i = helper(nums, i, nums[i]);
        }
        return ans;
    }

    int helper(int[] arr, int a, int b) {
        ans++;
        if(a + b >= arr.length - 1) return arr.length;
        int max = 0;
        int pos = 0;
        for(int i = a;i <= a+b; i++) {
            int c = arr[i] + i;
            if(c > max) {
                max = c;
                pos = i;
            }
        }
        return pos;
    }
}

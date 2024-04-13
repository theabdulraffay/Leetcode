class Solution {
    void per(int num[], int start) {
        if (start < num.length) {
            int temp = num[start];
            int r = num[temp];
            per(num, start + 1);
            num[start] = r;
        }
    }
    public int[] buildArray(int[] nums) {
        // int n = nums.length;
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++){
        //     arr[i] = nums[nums[i]];
        // }
        // return arr;

        per(nums, 0);
        return nums;
    }
}

class Solution {
    Boolean[] geep;
    boolean helper(int[] arr, int index, int step) {
        if (step >= arr.length - 1)
            return true;
        if (geep[index] != null)
            return geep[index];
        for (int i = step; i >= 0 && i >= index; i--) {
            if (helper(arr, i + 1, i + arr[i]))
                return geep[i] = true;
        }
        return geep[index] = false;
    }

    public boolean canJump(int[] nums) {
        geep = new Boolean[nums.length];
        return helper(nums, 0, nums[0]);

    }
}

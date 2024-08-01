class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int i = 0;
        int left = 0;
        int max = 0;
        while(i < nums.length) {
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                sum -= nums[left++];
            }
            set.add(nums[i]);
            sum += nums[i++];
            max = Math.max(max, sum);
        }
        return max;
    }
}

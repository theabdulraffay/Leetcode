class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (i < nums.length) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (map.get(nums[i]) > k) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) - 1);
                j++;
            }
            ans = Math.max(ans, i - j + 1);
            i++;
        }
        return ans;

        
    }
}

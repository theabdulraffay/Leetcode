class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;

        for(int i = 0; i < k; i ++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }
        long max = 0;
        if(map.size() == k) max = Math.max(max, sum);
        for(int i = k; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            map.put(nums[i - k], map.get(nums[i - k]) - 1);
            sum += (long)nums[i];
            sum -= nums[i - k];
            if(map.get(nums[i - k]) == 0) map.remove(nums[i-k]);

            if(map.size() == k) max = Math.max(max, sum);
        }
        return max;

        
    }
}

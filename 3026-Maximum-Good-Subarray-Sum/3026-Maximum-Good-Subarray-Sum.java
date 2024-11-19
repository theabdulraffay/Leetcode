class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Long> map = new HashMap<>();
        int n = nums.length;
        long sum = 0;
        long max = Long.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            long csum = sum + nums[i];
            if(map.containsKey(nums[i] - k)) {
                long prefix = map.get(nums[i] - k);
                if(map.containsKey(nums[i] + k)) {
                    prefix = Math.min(prefix,map.get(nums[i] + k));
                }
                max = Math.max(max, csum - prefix);
            }
            else if (map.containsKey(nums[i] + k)) {
                long prefix = map.get(nums[i] + k);
                max = Math.max(max, csum - prefix);
            }
            map.put(nums[i], Math.min(map.getOrDefault(nums[i], sum), sum));
            sum += nums[i];
        }
        return (max == Long.MIN_VALUE) ? 0 : max;
        
    }
}

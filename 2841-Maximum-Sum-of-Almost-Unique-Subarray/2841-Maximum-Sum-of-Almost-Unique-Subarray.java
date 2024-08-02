class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer, Integer> set = new HashMap<>();
        long sum = 0;
        long max = 0;
        for(int i = 0; i < k; i++) {
            sum += nums.get(i);
            set.put(nums.get(i), set.getOrDefault(nums.get(i), 0) + 1);
        }
        for(int i = k; i < nums.size(); i++) {
            if(set.size() >= m) max = Math.max(max, sum);
            int prev = nums.get(i - k);
            int forward = nums.get(i);
            sum -= (long)prev;
            sum += (long)forward;
            set.put(prev, set.getOrDefault(prev, 0) - 1);
            set.put(forward, set.getOrDefault(forward, 0) + 1);
            if(set.get(prev) == 0) set.remove(prev);
        }
        if(set.size() >= m) max = Math.max(max, sum);
        return max;
        
    }
}

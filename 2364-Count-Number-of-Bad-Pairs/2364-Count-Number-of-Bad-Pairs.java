class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalCombinations = (n * (n - 1))/2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] -= i;
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        long goodPairs = 0;
        for (int i : map.keySet()) {
            long p = map.get(i);
            goodPairs += (p * (p - 1))/2;
        }
        return totalCombinations - goodPairs;
        
    }
}

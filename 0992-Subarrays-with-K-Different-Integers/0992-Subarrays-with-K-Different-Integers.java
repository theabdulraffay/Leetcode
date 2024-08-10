class Solution {
    int helper(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int c = 0;
        int left = 0;

        for(int i =0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while(map.size() > k) {
                int m = nums[left++];
                map.put(m, map.get(m) - 1);
                if(map.get(m) == 0) map.remove(m);
            }
            c += (i - left + 1);
        }     
        return c;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }
}

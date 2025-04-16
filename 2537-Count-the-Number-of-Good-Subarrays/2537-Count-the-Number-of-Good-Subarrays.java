class Solution {
    public long countGood(int[] nums, int k) {
        int currentPairs = 0;
        long toret = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0 ; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            int count = map.get(nums[i]);
            currentPairs += count - 1;
            while(currentPairs >= k) {
                toret += (nums.length - i);
                int rem = map.get(nums[left]);
                map.put(nums[left], rem - 1);
                currentPairs -= rem - 1;
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
        }
        return toret;
        
    }
}

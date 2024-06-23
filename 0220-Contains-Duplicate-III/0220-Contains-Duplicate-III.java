class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;

        if(valueDiff == 0) {
            HashMap<Integer, Integer> set = new HashMap<>();
            for(int i = 0; i < n; i++) {
                if(set.containsKey(nums[i]) && Math.abs(i - set.get(nums[i])) <= indexDiff) return true;
                set.put(nums[i], i);
            }
            return false;
        }
        for(int i = 0; i < n; i++) {
            for(int j  = i + 1; j < n; j++) {
                if(Math.abs(j - i) <= indexDiff && Math.abs(nums[j] - nums[i]) <= valueDiff) {
                    return true;
                }

            }
        }
        return false;

        
    }
}

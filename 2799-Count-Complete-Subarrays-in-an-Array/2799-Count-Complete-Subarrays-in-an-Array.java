class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums) set.add(i);

        int size = set.size();
        // set.clear();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            set.clear();
            for(int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if(set.size() == size) count++;
            }
        }
        return count;
        
    }
}

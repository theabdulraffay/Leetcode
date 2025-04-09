class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int min = nums[0];
        for(int i : nums) {
            set.add(i);
            min = Math.min(min, i);
        }
        if(k > min) return -1;
        return k == min ? set.size() - 1 : set.size();
        
    }
}

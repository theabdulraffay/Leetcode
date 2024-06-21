class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        Set<Integer> unpair = new HashSet<>();
        int c = 0;
        for(int i : nums) {
            if(set.contains(i - k) && !unpair.contains(i - k)) {
                c++;
                unpair.add(i - k);
            }
            set.add(i);
        }
        return c;
    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for (int i : nums) { 
        //     if (i > 0){
        //     set.add(i); }
        // }

        // for(int i = 1; i <= nums.length; i++) {
        //     if(!set.contains(i))return i;
        // }
        // return nums.length + 1;
        int n = nums.length;
        boolean[] ans = new boolean[n + 1];
        for (int i : nums) {
            if (i > 0 && i <= n) {
                ans[i] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if(!ans[i]) return i;
        }
        return n+1;

        
    }
}

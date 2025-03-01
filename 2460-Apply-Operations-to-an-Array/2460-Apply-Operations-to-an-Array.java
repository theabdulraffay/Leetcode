class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] toret = new int[n];
        int c = 0;
        int i = 0;


        for (i = 0; i < n - 1; i++) {
            if(nums[i]  != 0) {
                if (nums[i] == nums[i + 1]) {
                    toret[c] = nums[i] * 2;
                    i++;

                } else {
                    toret[c] = nums[i];
                }
                c++;
            }
        }
        if(i != n) toret[c] = nums[n - 1];
        return toret;
        
    }
}

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k == 1) return nums;
        int n = nums.length;
        int[] toret = new int[n - k + 1];
        int c = 1;
        toret[0] = -1;
        // for(int i = 1; i < k; i++) {
        //     if(nums[i] == nums[i - 1] + 1) {
        //         c++;
        //         if(c >= k)toret[i - k + 1] = nums[i];
        //     } else c = 1;
        // }
        
        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i - 1] + 1) {
                c++;
                if(c >= k)toret[i - k + 1] = nums[i];
                else if(i >= k)toret[i - k + 1] = -1;
            } else {
                if(i >= k)toret[i - k + 1] = -1;
                c = 1;
            }
        }
        return toret;
        
    }
}

class Solution {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long sum = 1;
        int i = 0;
        while(sum <= n) {
            if(i < nums.length && nums[i] <= sum){
                sum += nums[i++];
            } else {
                patches++;
                sum *= 2;
            }
        }
        return patches;        
    }
}

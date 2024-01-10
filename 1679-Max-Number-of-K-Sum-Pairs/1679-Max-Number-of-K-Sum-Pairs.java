class Solution {
    public int maxOperations(int[] nums, int k) {
        int c = 0;
        int i = 0;
        int j = nums.length -1;
        Arrays.sort(nums);
        while(i<j && i < nums.length && j >= 0){
            int sum = nums[i] + nums[j];
            if(sum == k){c++; i++; j--; }
            else if(sum< k)i++;
            else j--;

        }
        return c;
        
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] list = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                int temp = nums[i] + nums[j];
                if(i == j)continue;
                if(temp == target ){
                    list[0] = i;
                    list[1] = j;
                    return list;
                }
            }
        }
        return list;
        
    }
}
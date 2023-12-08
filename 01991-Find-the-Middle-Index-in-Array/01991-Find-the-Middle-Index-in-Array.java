class Solution {
     public static int sum(int[] nums, int st, int en ){
        int count = 0;
        for(int i =st;i<en;i++){
            count += nums[i];
        }
        return count;
    }
    public int findMiddleIndex(int[] nums) {
        int start = 0;
        int end = nums.length;
        for(int i = 0;i<end;i++){
            int sum1 = sum(nums, 0,i);
            int sum2 = sum(nums,i+1,nums.length);
            if(sum1 == sum2){
                return i;
            }
        }
        return -1;
        
    }

}

class Solution {
    public static int sum(int[] nums, int st, int en ){
        int count = 0;
        for(int i =st;i<en;i++){
            count += nums[i];
        }
        return count;
    }
    public int pivotIndex(int[] nums) {
        int sum =0;
        for(int i:nums) sum += i;

        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            sum -= nums[i];

            if(sum == sum2){
                return i;
            }
            sum2 += nums[i];

        }
        return -1;
        // int start = 0;
        // int end = nums.length;
        // for(int i = 0;i<end;i++){
        //     int sum1 = sum(nums, 0,i);
        //     int sum2 = sum(nums,i+1,nums.length);
        //     if(sum1 == sum2){
        //         return i;
        //     }
        // }
        // return -1;
        
    }
}

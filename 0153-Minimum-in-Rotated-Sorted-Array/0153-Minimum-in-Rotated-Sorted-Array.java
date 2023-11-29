class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        } 
        int left = 0;
        int right = nums.length -1;
        int res = nums[0];
        while(left <= right){
            if(nums[left] < nums[right]){
                return Math.min(res,nums[left]);
            }
            int mid = (left + right) /2;
            res = Math.min(res,nums[mid]);
            //System.out.println(res);
            
            if(nums[left] <= nums[mid]){
                left = mid + 1;
                
            }else{
                right = mid -1;
            }
            
            
        }
        return res;

        
    }
}

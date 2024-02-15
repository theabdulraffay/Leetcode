class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] == nums[mid + 1]){
                if((mid + 1) % 2 == 1){
                    start = mid + 2; // as mid and mid + 1 both are same so we'll skip 2 elements
                }else end = mid - 1;
            }else if(mid > start && nums[mid] == nums[mid - 1]){
                if(mid % 2 == 1){
                    start = mid + 1;
                }else end = mid - 1;
            }else {
                return nums[mid];
            }
        }
        return -1;
        
    }
}

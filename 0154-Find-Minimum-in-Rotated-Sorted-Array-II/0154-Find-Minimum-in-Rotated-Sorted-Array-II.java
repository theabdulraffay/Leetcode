class Solution {
    int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(end > mid && nums[mid] > nums[mid + 1]){
                return mid;
            }else if(start < mid && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }else if (nums[start] == nums[end]){
                if(start < mid && nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
                if(end > mid && nums[end] < nums[end - 1]){
                    return end - 1;
                }
                end--;
            }else if(nums[start] > nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int findMin(int[] nums) {
        int peak = pivot(nums);
        return nums[peak + 1];
        
    }
}

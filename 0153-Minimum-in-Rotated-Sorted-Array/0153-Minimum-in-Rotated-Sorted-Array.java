class Solution {
    int peak(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && array[mid] > array[mid + 1]){
                return mid;
            }else if(mid > start && array[mid] < array[mid - 1]){
                return mid - 1;
            }else if(array[start] > array[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public int findMin(int[] nums) {
        int peak = peak(nums);
        return nums[peak + 1];
        
    }
}

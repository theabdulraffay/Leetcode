class Solution {
    static int pivotOfRotatedArray(int[] array){
		int start = 0;
		int end = array.length - 1;
		while(start <= end){
			int mid = start + (end - start) / 2;
			if(mid < end && array[mid] > array[mid + 1]){
				return mid; 
			}else if(mid > start && array[mid] < array[mid - 1]){
				return mid -1;
			}
			else if(array[start] > array[mid]){
				end = mid -1;
			}else{
				start = mid + 1;
			}
		}
		return -1;
	}
    static int index(int[] n, int target, int start, int end){
		while(start <= end){
			// int mid = (start + end)/2;
			int mid = start + (end - start)/2;
			if(n[mid] == target){
				return mid;
			}else if(n[mid] > target){
				end = mid - 1;
			}else{
				start = mid + 1;
			}
		}
		return -1;
	}
    public int search(int[] nums, int target) {
        int peak = pivotOfRotatedArray(nums);
        if (peak == -1){
            return index(nums,target,0,nums.length-1);
        }else if(target < nums[0]){
            return index(nums,target,peak+1,nums.length -1);
        }else{
            return index(nums, target, 0, peak);
        }
        
    }
    // public int search(int[] nums, int target) {
    //     for(int i =0;i<nums.length;i++){
    //         if(nums[i] == target){
    //             return i;
    //         }

    //     }
    //     return -1;
        
    // }
}

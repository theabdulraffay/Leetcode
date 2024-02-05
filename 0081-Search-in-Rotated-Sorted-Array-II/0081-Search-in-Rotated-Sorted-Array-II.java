class Solution {
    public int pivotOfDuplicatedRotatedArray(int[] array){
		int start = 0;
		int end = array.length - 1;
		while(start <= end){
			int mid = start + (end - start) / 2;
			if(mid < end && array[mid] > array[mid + 1]){
				return mid; 
			}else if(mid > start && array[mid] < array[mid - 1]){
				return mid -1;
			}else if(array[start] == array[end]){
				if(start < mid && array[start] > array[start + 1]){
					return start;
				}
				start++;
				if(end > mid && array[end] < array[end - 1]){
					return end - 1;
				}
				end--;
			}
			else if(array[start] > array[mid]){
				end = mid -1;
			}else{
				start = mid + 1;
			}
		}
		return -1;

	}

    boolean BS(int[] nums, int target, int s, int e){
        while(s <= e){
            int m = s + (e - s)/ 2;
            if(nums[m] == target){
                return true;
            }else if(nums[m] < target){
                s = m + 1;
            }else e = m - 1;
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int peak = pivotOfDuplicatedRotatedArray(nums);
        if(peak == -1){
            return BS(nums, target, 0, nums.length - 1);
        }
        if(target >= nums[0]){
            return BS(nums, target, 0, peak);
        }
        else{
            return BS(nums, target, peak + 1, nums.length-1);
        }
    }  
}

class Solution {
    static int Occurance(int[] n, int target, boolean firstOccurance){
		int start = 0;
		int end = n.length - 1;
		int ans = -1;
		while(start <= end){
			// int mid = (start + end)/2;
			int mid = start + (end - start)/2;
			if(n[mid] == target){
				ans = mid;
				if(firstOccurance){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else if(n[mid] > target){
				end = mid - 1;
			}else{
				start = mid + 1;
			}
		}
		return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] list = new int[2];
		int start = Occurance(nums, target, true);
		int end = Occurance(nums, target, false);
		list[0] = start;
		list[1] = end;
		return list;
        // int[] list = {-1,-1};
		// int start = 0, end = nums.length -1, c = 0, m = 0;
		// while(start <= end){
		// 	if(nums[start] == target){
		// 		list[0] = start; 
		// 		c++;
		// 	}else{
		// 		start++;
		// 	}

		// 	if(nums[end] == target){
		// 		list[1] = end; 
		// 		m++;
		// 	}else{
		// 		end--;
		// 	}

		// 	if(c > 0 && m > 0){
		// 		return list;
		// 	}
		// }
		// return list;
    }
}

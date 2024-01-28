class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            int r = arr[i] * 2;
            for(int j = 0;j<arr.length;j++)
                if(arr[j] == r && i!= j)return true;
        }
        return false;
        // Arrays.sort(arr);
	    	// for(int i = 0; i < arr.length; i++){
		    // 	int num = arr[i] * 2;
        //     int start = 0, end = arr.length - 1;
        //     while(start <= end){
        //         int mid = start + (end - start) / 2;
        //         if(num == arr[mid] && mid != i)
        //             return true;
        //         if(num > arr[mid])
        //             start = mid + 1;
        //         else
        //             end = mid - 1;
        //     }
		    // }
		    // return false;
        
    }
}

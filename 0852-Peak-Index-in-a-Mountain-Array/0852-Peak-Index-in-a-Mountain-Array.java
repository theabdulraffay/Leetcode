class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(arr[mid - 1] < arr[mid]){
                start = mid;
            }else if(arr[mid + 1] < arr[mid]){
                end = mid;
            }
        }
        return -1;
        // while(start <= end){
        //     if(arr[start] < arr[end]){
        //         start++;
        //     }else if(arr[start] > arr[end]){
        //         end--;
        //     }else if(start == end){
        //         return start;
        //     }else if(arr[start] == arr[end]){
        //         start++;
        //         end--;
        //     }
        // }
        // return start;

    }
}

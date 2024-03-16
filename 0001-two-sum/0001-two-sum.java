class Solution {
    int search (int[] arr, int numb, boolean last) {
        int n = arr.length;
        if(!last) {
            for(int i = 0; i < n; i++) {
                if(arr[i] == numb) return i;
            }
            return -1;
            
        } else {
            for(int i = n-1; i >= 0; i--) {
                if(arr[i] == numb) return i;
            }
            return -1;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = nums[i];
        }
        Arrays.sort(t);
        int st = 0;
        int en = n - 1;
        while (st < en) {
            int temp = t[st] + t[en];
            if(temp == target) {
                int first = search (nums, t[st], false);
                int sec = search (nums, t[en], true);
                return new int[] {first, sec};
            }else if (temp > target) {
                en--;
            }else {
                st++;
            }
        }
        return null;


        // for(int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int[] {i , j};
        //         }
        //     }
        // }
        // return null;
        
    }
}

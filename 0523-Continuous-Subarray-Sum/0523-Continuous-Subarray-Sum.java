class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += nums[j];
        //         if((j-i+1)>1 && sum % k == 0) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        int n = nums.length;
        for (int i = 1; i < n; i++) { 
            if(nums[i] == 0 && nums[i - 1] == 0) { return true; }
            else if(nums[i] + nums[i-1] % k == 0) { return true; }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            sum %= k;
            if(sum ==0 && i > 0) { return true; }
            if (map.containsKey(sum) && i - map.get(sum) > 1) { return true; }
            if(!map.containsKey(sum)) { map.put(sum, i); }
        }
        return false;


        
    }
}

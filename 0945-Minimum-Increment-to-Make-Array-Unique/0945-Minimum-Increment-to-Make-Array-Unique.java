class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]){
                int difference = Math.abs(nums[i] - nums[i-1]) + 1;
                c += difference;
                nums[i] += difference;
            }
        }
        return c;
        
        // HashSet<Integer> set = new HashSet<>();
        // int c= 0;
        // for(int i = 0; i < nums.length; i++) {
        //     while(set.contains(nums[i])) {
        //         nums[i]++;
        //         c++;
        //     }
        //     set.add(nums[i]);
        // }
        // return c;
    }
}

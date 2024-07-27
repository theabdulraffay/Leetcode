class Solution {
    public int totalFruit(int[] nums) {
        int i = 0;
        int firstIndex = 0;
        while(i < nums.length && nums[i] == nums[0]) i++;
        if(i == nums.length) return nums.length;
        
        int secondIndex = i;
        int max = 0;

        while(i < nums.length) {
            if(nums[i] != nums[firstIndex] && nums[i] != nums[secondIndex]) {
                max = Math.max(max, i - firstIndex);
                int ind = i - 1;
                while(ind > 0 && nums[ind] == nums[ind- 1]) ind--;
                firstIndex = ind;
                secondIndex = i;
            }
            i++;
        }
        max = Math.max(max, i - firstIndex);
        return max;
        
    }
}

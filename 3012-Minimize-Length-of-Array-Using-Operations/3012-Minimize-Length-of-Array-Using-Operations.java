class Solution {
    public int minimumArrayLength(int[] nums) {
        int min = Arrays.stream(nums).min().orElse(0);
        int count = 0;
        for(int i : nums) {
            if(i % min > 0) return 1;
            if(i == min) count++;
        }
        return (count + 1) / 2;
        
    }
}

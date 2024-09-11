class Solution {
    public long continuousSubarrays(int[] nums) {
        if (nums.length == 1) return 1;
        int i = 0, j = 0;
        long result = 0, count = 0, limit = 2;
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();

        while (j < nums.length) {
            while (!max.isEmpty() && nums[max.peekLast()] < nums[j]) max.pollLast();
            max.offerLast(j);
    
            while (!min.isEmpty() && nums[min.peekLast()] > nums[j]) min.pollLast();
            min.offerLast(j);

            while (Math.abs(nums[max.peekFirst()] - nums[min.peekFirst()]) > limit){ 
                if (min.peekFirst() == i) min.pollFirst();
                if (max.peekFirst() == i) max.pollFirst();
                i++;
            }
            
            result += j - i + 1;
            j++;     
        }
        
        return result;
    }
}                        

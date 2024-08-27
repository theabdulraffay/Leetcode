class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int maxLength = 0;
        int left = 0;
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        
        for (int right = 0; right < nums.length; right++) {
            int m = nums[right];
            while(!l1.isEmpty() && l1.getLast() < m) {
                l1.pollLast();
            }
            l1.addLast(m);

            while(!l2.isEmpty() && l2.getLast() > m) {
                l2.pollLast();
            }
            l2.addLast(m);
            // Ensure the window satisfies the condition
            while (l1.getFirst() - l2.getFirst() > limit) {
                // Remove the element at 'left' from the queues
                if(nums[left] == l1.getFirst())l1.removeFirst();
                if(nums[left] == l2.getFirst())l2.removeFirst();
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}

class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i : nums) {
            que.add(i);
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = que.poll();
        }
        return nums;
        
    }
}

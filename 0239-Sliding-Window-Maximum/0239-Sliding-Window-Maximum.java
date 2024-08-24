class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1) return nums;
        int n = nums.length;
        Deque<Integer> que = new LinkedList();
        int[] toret = new int[n - k + 1];
        int l = k;
        for(int i = 0; i < n; i++) {
            int num = nums[i];
            while(!que.isEmpty() && que.getLast() < num) {
                que.pollLast();
            }
            que.addLast(num);

            if(i >= k && nums[i - k] == que.getFirst()) {
                que.pollFirst();
            }
            if(i >= k - 1){
                toret[i - k + 1] = que.getFirst();
            }
        }
        return toret;
    }
}

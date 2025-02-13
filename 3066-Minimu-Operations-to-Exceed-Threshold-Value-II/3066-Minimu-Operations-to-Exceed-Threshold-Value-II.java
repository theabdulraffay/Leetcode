class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> que = new PriorityQueue<>();
        int num = 0;
        for(int i : nums) que.add((long)i);
        while(que.peek() < k && que.size() > 1) {
            long n = que.poll();
            long m = que.poll();
            long s = Math.min(n, m) * 2 + Math.max(n,m);
            que.add(s);
            num++;
        }
        return num;
        
    }
}

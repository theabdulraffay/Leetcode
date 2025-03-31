class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k == weights.length || k == 1) return 0;
        PriorityQueue<Long> que = new PriorityQueue<>();
        PriorityQueue<Long> que2 = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 1; i < weights.length; i++) {
            que.add((long)(weights[i] + weights[i - 1]));
            que2.add((long)(weights[i] + weights[i - 1]));
            if(que.size() >= k) {
                que.poll();
                que2.poll();
            }
        }
        long l1 = 0, l2 = 0;
        while (!que.isEmpty()) {
            l1 += que.poll();
            l2 += que2.poll();
        }

        return l1 - l2;
    }
}

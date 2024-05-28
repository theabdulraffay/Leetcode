class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        if(costs.length == 1) return costs[0];
        PriorityQueue<Integer> front = new PriorityQueue<>();
        PriorityQueue<Integer> back = new PriorityQueue<>();
        int head = 0;
        int tail = costs.length - 1;
        while(head < tail && candidates > 0) {
            front.add(costs[head]);
            back.add(costs[tail]);
            head++;
            tail--;
            candidates--;
        }
        long sum = 0;

        while(k > 0 && front.size() > 0 && back.size() > 0) {
            if(front.peek() <= back.peek()) {
                sum += front.poll();
                if(head <= tail) {
                    front.add(costs[head++]);
                }
            } else {
                sum += back.poll();
                if(head <= tail) {
                    back.add(costs[tail--]);
                }
            }
            k--;
        }

        while(k > 0 && front.size() > 0 ) {
            sum += front.poll();
            k--;
        }

        while(k > 0 && back.size() > 0 ) {
            sum += back.poll();
            k--;
        }

        return sum;
        
    }
}

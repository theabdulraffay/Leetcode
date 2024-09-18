class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            while (!deque.isEmpty() && points[i][0] - points[deque.peekFirst()][0] > k) {
                deque.pollFirst();
            }
            if (!deque.isEmpty()) {
                max = Math.max(max, points[i][1] + points[deque.peekFirst()][1] + (points[i][0] - points[deque.peekFirst()][0]));
            }
            while (!deque.isEmpty() && points[i][1] - points[i][0] >= points[deque.peekLast()][1] - points[deque.peekLast()][0]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        return max;     
    }
}

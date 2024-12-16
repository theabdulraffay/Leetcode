public class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[] { nums[i], i });
        }

        while (k-- > 0) {
            int[] val = pq.poll();
            nums[val[1]] *= multiplier;
            pq.add(new int[] { nums[val[1]], val[1] });
        }

        return nums;
    }
}

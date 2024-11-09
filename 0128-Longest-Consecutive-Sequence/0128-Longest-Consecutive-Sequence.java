class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        int c = 1;
        int max = 0;
        for (int i : nums)
            if (!set.contains(i)) {
                set.add(i);
                que.add(i);
            }
        while (!que.isEmpty()) {
            int i = que.poll();
            if (set.contains(i + 1))
                c++;
            else {
                max = Math.max(max, c);
                c = 1;
            }
        }
        return max;

    }
}

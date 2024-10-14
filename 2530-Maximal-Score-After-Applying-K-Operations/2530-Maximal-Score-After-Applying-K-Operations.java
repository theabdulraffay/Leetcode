class Solution {
    public long maxKelements(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<Integer> tree = new PriorityQueue<>((a, b) -> b - a);
        for(int i : nums) {
            tree.add(i);
        }

        while(k-- > 0) {
            int temp = tree.poll();
            sum += temp;
            tree.add((int)Math.ceil(temp / 3.0));
        }
        return sum;
    }
}

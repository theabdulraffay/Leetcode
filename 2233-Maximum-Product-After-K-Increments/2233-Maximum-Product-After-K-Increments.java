class Solution {
    public int maximumProduct(int[] nums, int k) {
        final int f = 1000000007;
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        for(int i : nums) {
            que.add(i);
        }

        while(k-- > 0) {
            que.add(que.poll() + 1);
            // int t = que.poll();
            // t++;
            // que.add(t);
        }

        long toret = 1;
        while(!que.isEmpty()) {
            toret = (toret * que.poll()) % f;
        }

        return (int)(toret % f);
        
    }
}

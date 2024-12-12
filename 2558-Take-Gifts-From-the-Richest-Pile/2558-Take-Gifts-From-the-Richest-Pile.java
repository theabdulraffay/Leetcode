class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b) -> b - a);
        for(int i : gifts) {
            que.add(i);
        }
        for(int i = 0; i < k; i++) {
            que.add((int)Math.sqrt(que.poll()));
        }
        long t = 0;
        while(!que.isEmpty()) {
            t += que.poll();
        }
        return t;
        
    }
}

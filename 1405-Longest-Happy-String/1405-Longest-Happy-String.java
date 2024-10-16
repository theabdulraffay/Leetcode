class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> que = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        if (a > 0)
            que.add(new int[]{a, 'a'});
        if (b > 0)
            que.add(new int[]{b, 'b'});
        if (c > 0)
            que.add(new int[]{c, 'c'});
        StringBuilder sb = new StringBuilder();
        while (!que.isEmpty()) {
            int[] t1 = que.poll();
            if(sb.length() > 1 && sb.charAt(sb.length() - 1) == (char)t1[1] && sb.charAt(sb.length() - 2) == (char)t1[1]) {
                if(que.isEmpty()) break;
                int[] t2 = que.poll();
                sb.append((char)t2[1]);
                t2[0]--;
                if(t2[0] > 0)que.add(t2);
                que.add(t1);
            } else {
                sb.append((char)t1[1]);
                t1[0]--;
                if(t1[0] > 0)que.add(t1);
            }
        }
        return sb.toString();
    }
}

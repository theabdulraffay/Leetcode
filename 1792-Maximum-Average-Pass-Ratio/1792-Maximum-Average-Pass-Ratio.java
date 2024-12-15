class Solution {
    class Pair{
        int x,y;
        double gain;

        Pair(int[] arr) {
            x = arr[0];
            y = arr[1];
            gain = (double)(x+1)/ (y+1) - (double)x/y;
        }
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Pair> que = new PriorityQueue<>((a, b) -> Double.compare(b.gain, a.gain));
        for(int[] i : classes) {
            que.add(new Pair(i));
        }
        while(extraStudents-- > 0) {
            Pair p = que.poll();
            que.add(new Pair(new int[]{p.x+1, p.y+1}));
        }
        double sum = 0;
        while(!que.isEmpty()) {
            sum += (double)que.peek().x / que.poll().y;
        }
        return sum/classes.length;
        
    }
}

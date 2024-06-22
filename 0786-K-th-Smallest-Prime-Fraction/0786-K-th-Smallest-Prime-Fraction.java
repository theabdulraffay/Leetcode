class Node implements Comparable<Node>{
    int k;
    int m;
    Node(int h, int g) {
        k = h;
        m = g;
    }
     @Override
    public int compareTo(Node other) {
        double thisRatio = (double) this.k / this.m;
        double otherRatio = (double) other.k / other.m;

        if (thisRatio == otherRatio) {
            return 0;
        } else if (thisRatio > otherRatio) {
            return 1;
        } else {
            return -1;
        }
    }

}
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        if(k == 1) return new int[]{arr[0], arr[arr.length - 1]};
        PriorityQueue<Node> que = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                Node n = new Node (arr[i], arr[j]);
                que.add(n);
            }
        }

        while(k-- > 1) {
            que.poll();
        }

        return new int[]{que.peek().k, que.peek().m};
    }
}

class Solution {
    public double averageWaitingTime(int[][] c) {
        int t = c[0][0] + c[0][1];
        long avg = c[0][1];
        for(int i = 1; i < c.length; i++) {
            if(c[i][0] >= t) {
                t = c[i][0] + c[i][1];
                avg += c[i][1];
                continue;
            }
            t += c[i][1];
            avg += t - c[i][0];
        }

        return (double)avg/(double)c.length;

        
    }
}

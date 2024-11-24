class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int c = 0;
        for(int[] i : matrix) {
            for(int j : i) {
                int t = Math.abs(j);
                sum += t;
                min = Math.min(min, t);
                if(j <= 0) {
                    c++;
                }
            }
        }
        return c % 2 == 0 ? sum : sum - (2 * min);
        
    }
}

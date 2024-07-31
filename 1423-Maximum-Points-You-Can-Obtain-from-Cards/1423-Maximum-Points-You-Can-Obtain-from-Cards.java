class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int win = n - k;
        int i = 0;
        int tsum = 0;
        int left = 0;
        for(int j : cardPoints) tsum += j;
        int min = tsum;
        int sum = 0;
        while(i < win) {
            sum += cardPoints[i++];
        }

        while(i < n) {
            min = Math.min(min, sum);
            sum -= cardPoints[left++];
            sum += cardPoints[i++];
        }
        min = Math.min(min, sum);

        return tsum - min;
        
    }
}

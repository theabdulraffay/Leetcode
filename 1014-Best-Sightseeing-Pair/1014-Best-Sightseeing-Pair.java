class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int num = 0;
        for(int i = 1; i < values.length; i++)  {
            num = Math.max(num, values[i]+values[max] + max - i);
            max = values[i] - 1 >= values[max] - i + max ? i : max;
        }
        return num;
        
    }
}

class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b) -> a[0] - b[0]);
        int c = meetings[0][0] - 1, max = meetings[0][1];
        for(int i = 1; i < meetings.length; i++) {
            int[] j = meetings[i];
            if(j[0] > max) {
                c += j[0] - max - 1;
                max = j[1]; 
            } else {
                max = Math.max(max, j[1]);
            }
        }
        c += days - max;
        return c;       
    }
}

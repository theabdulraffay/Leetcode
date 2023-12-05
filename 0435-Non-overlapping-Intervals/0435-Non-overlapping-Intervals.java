class Solution {
    public static int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int end = intervals[0][1];
        int count = 1;
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0] >= end) {
            	end = intervals[i][1];

            	count++;
            }

        }
        return intervals.length - count;
    }
}

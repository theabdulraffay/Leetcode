class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < intervals.length; i++) {
            while (i != intervals.length -1 && intervals[i][1] >= intervals[i+1][0] && intervals[i+1][1] >= intervals[i][0]) {
                intervals[i+1][0] = Math.min(intervals[i][0], intervals[i+1][0]);
                intervals[i+1][1] = Math.max(intervals[i+1][1], intervals[i][1]);
                i++;
            }
            list.add(intervals[i]);
        }
        return list.toArray(new int[list.size()][2]);
        
    }
}

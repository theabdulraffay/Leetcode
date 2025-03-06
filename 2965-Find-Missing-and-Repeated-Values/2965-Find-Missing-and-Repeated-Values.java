class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length;
        int m =(n *(n + 1)) / 2;
        int a = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i[] : grid) {
            for(int j : i) {
                if(set.contains(j)) {
                    a = j;
                    continue;
                }
                set.add(j);
                m -= j;
            }
        }
        return new int[]{a, m};
        
    }
}

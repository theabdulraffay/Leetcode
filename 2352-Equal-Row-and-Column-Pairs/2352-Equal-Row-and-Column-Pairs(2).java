class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int[] i : grid) {
            StringBuilder sb = new StringBuilder();
            for(int j : i) {
                sb.append(j);
                sb.append(" ");
            }
            String t = sb.toString();
            map.put(t , map.getOrDefault(t, 0) + 1);
        }

        int ans = 0;

        for(int i = 0; i < grid[0].length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < grid.length; j++) {
                sb.append(grid[j][i]);
                sb.append(" ");
            }
            String t = sb.toString();
            if(map.containsKey(t)) {
                ans += map.get(t);
            }
        }
        return ans;
        
    }
}

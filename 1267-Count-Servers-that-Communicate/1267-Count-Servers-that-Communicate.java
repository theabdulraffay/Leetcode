class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] mark = new int[n][m];
        Queue<int[]> que = new LinkedList<>();
        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    que.add(new int[]{i, j});
                }
            }
            if (que.size() < 2) que.clear();
            else while(!que.isEmpty()) {
                int[] dir = que.poll();
                int x = dir[0];
                int y = dir[1];
                mark[x][y] = -1;
                c++;
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (grid[i][j] == 1) {
                    que.add(new int[]{i, j});
                }
            }
            if (que.size() < 2) que.clear();
            else while(!que.isEmpty()) {
                int[] dir = que.poll();
                int x = dir[0];
                int y = dir[1];
                if (mark[x][y] != -1)c++;
                // mark[x][y] = -1;
            }
        }

        return c;
    }
}

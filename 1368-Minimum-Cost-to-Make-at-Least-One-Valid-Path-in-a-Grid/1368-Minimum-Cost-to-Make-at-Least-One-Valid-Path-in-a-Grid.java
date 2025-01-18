class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Deque<int[]> que = new LinkedList<>();
        int[][] moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[m][n];

        que.offer(new int[]{0,0,0});
        while(!que.isEmpty()) {
            int[] arr = que.poll();
            int x = arr[0], y = arr[1], cost = arr[2];

            if (visited[x][y]) continue;
            visited[x][y] = true;

            if (x == m - 1 && y == n - 1) return cost;

            for (int i = 0; i < 4; i++) {
                int nx = x + moves[i][0];
                int ny = y + moves[i][1];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if(grid[x][y] == i + 1) {
                        que.addFirst(new int[]{nx, ny, cost});
                    } else {
                        que.addLast(new int[]{nx, ny, cost + 1});
                    }
                }
            }
        }
        return 0;

        
    }
}

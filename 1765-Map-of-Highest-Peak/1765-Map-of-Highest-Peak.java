class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length;
        int m = isWater[0].length;
        int[][] arr = new int[n][m];
        Queue<int[]> que = new LinkedList<>();
        for (int i = 0 ;i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = -1;
                if (isWater[i][j] == 1) {
                    arr[i][j] = 0;
                    que.add(new int[]{i, j});
                }
           }
        }

        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};

        while(!que.isEmpty()) {
            int[] r = que.poll();
            int x = r[0];
            int y = r[1];
            for (int[] direction : dir) {
                int nx = x + direction[0];
                int ny = y + direction[1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == -1) {
                    arr[nx][ny] = arr[x][y] + 1;
                    que.add(new int[] {nx, ny});
                }
            }
        }
        return arr;
        
    }
}

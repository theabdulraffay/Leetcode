class Solution {
    int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int connected(int[][] grid, int x, int y, int id) {
        if (grid[x][y] != 1) {
            return 0;
        }
        grid[x][y] = id;
        int max = 1;
        for (int[] i : dir) {
            int nx = x + i[0];
            int ny = y + i[1];
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) {
                max += connected(grid, nx, ny, id);
            }
        }
        return max;
    }   

    public int largestIsland(int[][] grid) {
        int n = grid.length;
        List<Integer> key = new ArrayList<>();
        int id = 2;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                   int size = connected(grid, i, j, id);
                   key.add(size);
                   id++;
                }
            }
        }
        if(key.isEmpty()) return 1;


        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> seen = new HashSet<>();
                    int sum = 1;
                    for (int[] dir : dir) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] >= 2) {
                            int islandId = grid[ni][nj];
                            if (!seen.contains(islandId)) {
                                sum += key.get(islandId - 2);
                                seen.add(islandId);
                            }
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
        }



        return max == 0  ? n * n : max;
    }
}

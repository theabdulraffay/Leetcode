class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }

        int[] row = new int[n];
        int[] col = new int[m];
        for (int i = 0; i < arr.length; i++) {
            int[] temp = map.get(arr[i]);
            int x = ++row[temp[0]];
            int y = ++col[temp[1]];
            if (x == m || y == n) return i;
        }
        return 0;
        
    }
}

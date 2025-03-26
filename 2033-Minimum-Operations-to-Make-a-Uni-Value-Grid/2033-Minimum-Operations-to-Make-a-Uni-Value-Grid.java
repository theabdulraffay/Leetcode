class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr= new int[n * m];
        int k = 0;
        for(int[] i : grid) {
            for(int j : i) {
                arr[k++] = j;
            }
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if((arr[i] - arr[i - 1]) % x != 0) return -1;
        }
        int mid = arr[arr.length / 2];
        int c = 0;
        for (int i : arr) {
            c += Math.abs(mid - i) / x;
        }
        return c;
        
    }
}

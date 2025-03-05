class Solution {
    public long coloredCells(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 1;
        for(int i = 1 ; i <= n; i++) {
            arr[i] = arr[i - 1] + (4l * i);
        }
        return arr[n - 1];
        
    }
}

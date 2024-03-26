class Solution {
    public int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];
        int i = 0;
        int stRow = 0;
        int enCol = ans[0].length - 1;
        int enRow = ans.length - 1;
        int stCol = 0;
        n *= n;
        while (i < n) {
            for (int j = stRow; j <= enCol; j++) {
                ans[stRow][j] = ++i;
            }
            stRow++;
            if (i == n)break;

            for (int j = stRow; j <= enRow; j++) {
                ans[j][enCol] = ++i;
            }
            enCol--;
            if (i == n)break;

            for (int j = enCol; j >= stCol; j--) {
                ans[enRow][j] = ++i;
            }
            enRow--;
            if (i == n)break;

            for (int j = enRow; j >= stRow; j--) {
                ans[j][stCol] = ++i;
            }
            stCol++;
            if (i == n)break;

        }
        return ans;
    }
}

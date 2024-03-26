class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int col = matrix[0].length;
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int stRow = 0;
        int enCol = col - 1;
        int enRow = rows - 1;
        int stCol = 0;
        int t = rows * col;

        while (i < t) {
            for (int j = stRow; j <= enCol; j++) {
                ans.add(matrix[stRow][j]);
                i++;
            }
            stRow++;
            if (i == t) break;
            for (int j = stRow; j <= enRow; j++) {
                ans.add(matrix[j][enCol]);
                i++;
            }
            enCol--;
            if (i == t) break;
            for (int j = enCol; j >= stCol; j--) {
                ans.add(matrix[enRow][j]);
                i++;
            }
            enRow--;
            if (i == t) break;
            for (int j = enRow; j >= stRow; j--) {
                ans.add(matrix[j][stCol]);
                i++;
            }
            stCol++;
            if (i == t) break;
        }
        return ans;
        
    }
}

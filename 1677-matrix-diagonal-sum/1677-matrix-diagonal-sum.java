class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        
        for(int i =0; i < n; i++){
            sum = sum + mat[i][i] + mat[i][n-i-1];

        }
        if(n % 2 == 1){
            n = n/2;
            sum = sum - mat[n][n];
        }

        return sum;
    }
}
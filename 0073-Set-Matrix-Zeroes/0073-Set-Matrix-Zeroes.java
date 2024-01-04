class Solution {
    static int[] setzero(int[] n){
		int[] t = new int[n.length];
		for(int i = 0; i < n.length; i++){
			t[i] = 0;
		}
		return t;
	}
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<Integer> col = new ArrayList<Integer>();
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length;j++){
				if(matrix[i][j]== 0){
					row.add(i);
					col.add(j);

				}
			}
		}
		for(int i = 0;i<row.size();i++){
			matrix[row.get(i)] = setzero(matrix[row.get(i)]);
			int t = col.get(i);
			for(int k = 0;k<matrix.length;k++){
				matrix[k][t] = 0;
			}
		}

        
    }
}

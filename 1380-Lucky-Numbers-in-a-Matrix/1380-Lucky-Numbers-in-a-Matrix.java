class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int ind = 0;
            for(int j = 0; j < matrix[0].length; j++) {
                if(min > matrix[i][j]){
                    ind = j;
                    min = matrix[i][j];
                }
            }

            for(int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][ind]);
            }
            if(max == min) list.add(min);
        }
        return list;
        
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] i : matrix){
            for(int j = 0; j<i.length;j++){
                if(i[j] == target){
                    return true;
                }
            }
        }
        return false;
        
    }
}
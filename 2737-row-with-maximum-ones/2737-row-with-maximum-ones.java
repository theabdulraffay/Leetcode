class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0;i<mat.length;i++){
            int counter =0;
            for(int j =0;j < mat[i].length;j++){
                if(mat[i][j] == 1){
                    counter++;
                }
            }
            temp.add(counter);
        }
        int m = temp.get(0);
        for(int i =0;i< temp.size();i++){
            if(temp.get(i) > m){
                m = temp.get(i);
            }
        }
        for(int i = 0;i<temp.size();i++){
            if(temp.get(i) == m){
                int[] list = {i,m};
                return list;
            }
        }
        int[] no = new int[0];
        return no;
    }
}
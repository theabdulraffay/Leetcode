class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> temp = new ArrayList<>();
        //System.out.println(temp.get(0).get(0));

        for(int i =1;i<=rowIndex+1;i++){
        	List<Integer> tem = new ArrayList<>();
            for(int j = 1 ;j<= i;j++){
                if(j == 1 || j == i){
                    tem.add(1);
                    continue;
                }else{
                	int k = temp.get(i-2).get(j-1) + temp.get(i-2).get(j - 2);
                    tem.add(k);
                }
            }   
            temp.add(tem);
        }
        return(temp.get(temp.size()-1));
        
    }
}

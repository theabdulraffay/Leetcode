class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> n = new ArrayList<>();
		for(int i =1;i<=numRows;i++){
			List<Integer> temp = new ArrayList<>();
			for (int j =1; j<=i; j++) {
				if(j == 1 || j == i){
					temp.add(1);
				}else{
					int num = n.get(i-2).get(j-2) + n.get(i-2).get(j-1);
					temp.add(num);
					//temp.add(0);
				}

				
			}
			n.add(temp);
		}
        return n;

        
    }
}
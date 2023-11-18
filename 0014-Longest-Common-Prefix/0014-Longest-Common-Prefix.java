class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ind = "";
		int counter = 0;

		while(counter < strs[0].length()){
			int temp = 0;
			for(int j = 0;j<strs.length-1;j++){
				if(counter >= strs[j+1].length()){
					//System.out.println(ind);
					break;
				}
				if(strs[j].charAt(counter) == strs[j+1].charAt(counter)){
					temp++;
				}else{
                    return ind;
                }

			}
			if(temp == strs.length-1){
				ind += strs[0].charAt(counter);
			}
			counter++;
		}
        return ind;
        
    }
}

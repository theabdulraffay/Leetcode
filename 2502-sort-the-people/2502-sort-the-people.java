class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] temp = new String[heights.length];
		int i;
		int n = 0;
			for(int k =0;k<heights.length;k++){
				int counter = 0;
					for(i =0;i<heights.length;i++){
						if(heights[i] > counter)counter = heights[i];
					}
					for(int j =0 ;j<heights.length;j++){
						//System.out.println(heights[j]);
						if(counter == heights[j]){
							temp[n] = names[j];
							heights[j] = 0;
							n++;
							break;
						}
					}
				}
                return temp;
        
    }
}
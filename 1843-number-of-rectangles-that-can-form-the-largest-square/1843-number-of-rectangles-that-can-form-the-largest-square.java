class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] temp = new int[rectangles.length];
		int counter = 0;
		for(int[] i : rectangles){
			if(i[0]<i[1]) temp[counter] = i[0];
			else temp[counter] = i[1];
			counter++;
		}
		//printlist(temp);
		Arrays.sort(temp);
		//printlist(temp);
		int num = 1;
		for(int i = temp.length-1;i>0;i--){
			if(temp[i] == temp[i-1]){
				num++;
			}
            else break;
		}
        return num;
        
    }
}
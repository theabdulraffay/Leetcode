class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] n = new int[image.length][];
		int ncounter = 0;
		for(int[] i : image){
			int[] temp = new int[i.length]; 
			int counter = 0;
			for (int j= i.length-1;j>=0 ;j-- ) {
				if(i[j] == 0){
					temp[counter] = 1;
				}else {
					temp[counter] = 0;
				}
				counter++;

				
			}
			n[ncounter] = temp;
			ncounter++;
 		}
         return n;
    }
}
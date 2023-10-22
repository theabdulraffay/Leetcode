class Solution {
    public int[] countBits(int n) {
        int[] fin = new int[n+1];
		for(int i = 0; i<=n;i++){
			int counter = 0;
			boolean x = true;
			int temp = i;
			while(temp > 0){
				int no = temp%2;
				temp /= 2;
				if(no == 1){counter++;} 
			}
			fin[i] = counter;
		}
        return fin;
    }
}
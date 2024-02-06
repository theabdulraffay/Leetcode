class Solution {
    int successPair(int n, int[] num, long success){
        int start = 0;
        int end = num.length - 1;
        while(start <= end){
        	int mid = start + (end - start) / 2;
        	long temp = (long)num[mid] * n;
        	if(temp >= success){
        		end = mid -1;
        	}
        	else{
                start = mid + 1;
            }
        }
        return num.length - start;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] n = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0;i<spells.length; i++){
            int temp = successPair(spells[i], potions, success);
            n[i] = temp;
        }
        return n;
        
    }
}

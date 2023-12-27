class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int d[] = new int[9];
		d[0] = 1;
		for(int i = 1; i < 9; i++){
			int prod = 1;
			int m = 9;
			for(int j = 0;j<i-1;j++)
				prod *= m--;

			prod *= 9;
			prod += d[i-1];
			d[i] = prod;
		}
        return d[n];
        
    }
}

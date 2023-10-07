class Solution {
    public double average(int[] salary) {
		int n = 0;
		int m = 9999999;
		double sum = 0; 
		int p = salary.length;
		for(int i = 0; i < p; i++){
			if(n<salary[i]){
				n = salary[i]; //max ka lia
			}
			if(m>salary[i]){
				m = salary[i]; //min ka lia
			}

			sum += salary[i];
		}
        double x = (sum-n-m)/(p-2);
		return x;

		
        
    }
        
}

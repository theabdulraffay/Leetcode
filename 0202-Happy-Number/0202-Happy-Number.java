class Solution {
    public static int sum (int n){
		int s = 0;
		while(n > 0){
			int temp = n % 10;
			s+= temp * temp;
			n /= 10;

		}
		return s;
	}
    public boolean isHappy(int n) {
        for(int i = 0; i <= n; i++) {
			n = sum(n);
			if(n == 1){
                return true;
            }
		}
        return false;

        
    }
}

class Solution {
    public static int sum (int n){
		int s = 0;
		while(n > 0){
			int temp = n % 10;
			s+= temp;
			n /= 10;

		}
		return s;
	}
    
    public int addDigits(int num) {
        if(num < 10)return num;
        else if(num % 9 == 0)return 9;
        else return num%9;



        // while(num > 9){
        //     num = sum(num);
        // }
        // return num;
    }
}

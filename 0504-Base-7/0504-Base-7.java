class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);


        // if(num == 0)return "0";
        // int c = 0;
		// if(num < 0){
		// 	c = 1;
		// 	num *= -1;
		// }
		// StringBuilder sb = new StringBuilder();
		// while(num >= 1){
		// 	int t= num % 7;
		// 	sb.insert(0,t);
		// 	num /= 7;
		// }

		// return((c == 0)? sb.toString(): sb.insert(0,'-').toString());

        
    }
}

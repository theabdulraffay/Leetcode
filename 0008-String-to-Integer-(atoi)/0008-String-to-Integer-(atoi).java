class Solution {
    public int myAtoi(String s) {
    int i = 0;
		long temp = 0;
		int n = s.length();
		int sign = 1;
		while (i < n  && s.charAt(i) == ' ')i++;
    if(i >= n)return 0;
		if(s.charAt(i) == '-')sign = -1;
		if(s.charAt(i) == '+' || s.charAt(i) == '-')i++;
		while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
			int x = s.charAt(i) - '0';
			temp = temp*10 + x;
			i++;
			if(temp > Integer.MAX_VALUE | temp*-1 <= Integer.MIN_VALUE){
				if(sign == 1) return(Integer.MAX_VALUE);
        else return Integer.MIN_VALUE;
			}
		}
        return (int)temp * sign;
    }
}

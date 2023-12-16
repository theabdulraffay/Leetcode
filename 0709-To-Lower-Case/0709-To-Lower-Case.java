class Solution {
    public static char convert(char c){
		int f = (int)c + 32;
		return (char)f;
	}
    public String toLowerCase(String s) {
        return s.toLowerCase();
        // String newstr = "";
		// for(int i = 0; i < s.length(); i++) {
		// 	char temp = s.charAt(i);
		// 	if((int) temp < 91 && (int)temp > 64){
		// 		temp = convert(temp);
		// 	}
		// 	 newstr += temp;
		// }
        // return newstr;
        
    }
}

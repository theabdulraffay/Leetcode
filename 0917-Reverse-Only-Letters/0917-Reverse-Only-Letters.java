class Solution {
    public String reverseOnlyLetters(String s) {

        char[] str = s.toCharArray();
		int start = 0;
		int end = str.length -1;
		while(start < end) {
			if(Character.isLetter(str[start]) && Character.isLetter(str[end])) {
				char temp = str[start];
				str[start++] = str[end];
				str[end--] = temp;
			}
			if(!Character.isLetter(str[start]))start++;
			if(!Character.isLetter(str[end]))end--;
		}
        return (new String(str));
        // int start = 0;
		// int end = s.length()-1;
		// while (start < end) {
		// 	char fir = s.charAt(start);
		// 	char last = s.charAt(end);
		// 	if(!Character.isLetter(fir)){
		// 		start++;
		// 		continue;
		// 	}if(!Character.isLetter(last)){
		// 		end--;
		// 		continue;
		// 	}
		// 	s = s.substring(0,start) + last + (s.substring(start + 1, end) + fir + s.substring(end + 1, s.length()));
		// 	start++;
		// 	end--;
		// }
        // return s;
        
    }
}

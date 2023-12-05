class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++) {
        	if(c1[i] != c2[i]){
        		return(false);
        	}
        }
        return(true);
        // if(s.length() != t.length()){
		// 	return false;
		// }
		// char[] temp = new char[s.length()];
		// char[] temp2 = new char[s.length()];
        // for(int i =0;i<s.length();i++){
        //     temp[i] = s.charAt(i);
        //     temp2[i] = t.charAt(i);
        // }
        // Arrays.sort(temp2);
        // Arrays.sort(temp);
        // // for (int i = 0;i<s.length();i++ ) {
        	
        // // 	if(temp[i] != temp2[i]) {
        // // 		return false;
        		
        // // 	}
        	
        // // }
        // return Arrays.equals(temp,temp2);

        
    }
}

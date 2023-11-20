class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
			return false;
		}
		char[] temp = new char[s.length()];
		char[] temp2 = new char[s.length()];
        for(int i =0;i<s.length();i++){
            temp[i] = s.charAt(i);
            temp2[i] = t.charAt(i);
        }
        Arrays.sort(temp2);
        Arrays.sort(temp);
        // for (int i = 0;i<s.length();i++ ) {
        	
        // 	if(temp[i] != temp2[i]) {
        // 		return false;
        		
        // 	}
        	
        // }
        return Arrays.equals(temp,temp2);

        
    }
}

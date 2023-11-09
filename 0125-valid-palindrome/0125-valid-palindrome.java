class Solution {
    public boolean isPalindrome(String s) {
        s.toLowerCase();
        if(s.isEmpty()){
            return true;
        }

        int start = 0;
        int last = s.length() -1;
        while(start <= last){
            char fchar = s.charAt(start);
            char lchar = s.charAt(last);
            if(!Character.isLetterOrDigit(fchar)) {
                start++;
            }
            else if (!Character.isLetterOrDigit(lchar)){
                last--;
            }

            else {
        		if (Character.toLowerCase(fchar) != Character.toLowerCase(lchar)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
        
    }
}
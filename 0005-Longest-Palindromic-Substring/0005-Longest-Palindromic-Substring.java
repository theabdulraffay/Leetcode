class Solution {
    boolean yes(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        // if(s.length() < 2) return s;
        String str = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((j - i + 1) > str.length()){    
                    String tempstr = s.substring(i, j + 1);
                    if(yes(tempstr)) {
                        str = tempstr;
                    }
                }
            }
        }
        return str;
        
    }
}

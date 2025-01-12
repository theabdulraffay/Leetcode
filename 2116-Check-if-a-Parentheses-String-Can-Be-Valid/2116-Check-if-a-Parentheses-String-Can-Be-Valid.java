class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) return false; 
        int balance = 0, avalible = 0;
        for(int i = 0; i < s.length(); i++) {
            if(locked.charAt(i) == '0') avalible++;
            else {
                if (s.charAt(i) == '(') balance++;
                else balance--;
            }
            if (balance + avalible < 0) return false;
        }
        balance = 0; avalible = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(locked.charAt(i) == '0') avalible++;
            else {
                if (s.charAt(i) == ')') balance++;
                else balance--;
            }
            if (balance + avalible < 0) return false;
        }
        return true;
        
    }
}

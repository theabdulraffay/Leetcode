class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int start = 0;
        int last = s.length()-1;
        while(start <= last){
            if(s.charAt(start) != s.charAt(last)){
                return false;
            }
            start++;
            last--;

        }
        return true;
        
    }
}

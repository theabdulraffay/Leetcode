class Solution {
    public boolean isSubsequence(String s, String t) {
        int lens = s.length(), lent = t.length();
        int temp = 0;
        for(int i =0;i<lent && temp<lens;i++){
            if(t.charAt(i) == s.charAt(temp)){
                temp++;
            }
        }
        return temp == lens;
    }
}
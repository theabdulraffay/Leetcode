class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int en = s.length - 1;
        while(st<en){
            char t = s[st];
            s[st] = s[en];
            s[en] = t;
            st++;
            en--;
        }
    }
}

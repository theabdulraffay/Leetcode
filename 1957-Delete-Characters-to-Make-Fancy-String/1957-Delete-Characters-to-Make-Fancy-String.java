class Solution {
    public String makeFancyString(String s) {
        char[] ch = s.toCharArray();
        if(ch.length < 3) return s;
        for(int i = 2; i < ch.length; i++) {
            if(ch[i] == ch[i - 1] && ch[i] == ch[i-2]) {
                ch[i-2] = '.';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char o : ch) if(o != '.')sb.append(o);
        return sb.toString();
        
    }
}

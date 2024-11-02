class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str = sentence.split(" ");
        int n = str.length;
        if(str[0].charAt(0) != str[n - 1].charAt(str[n - 1].length() - 1)) return false;
        for(int i = 1; i < n; i++) {
            if(str[i].charAt(0) != str[i - 1].charAt(str[i - 1].length() - 1)) return false;
        }
        return true;


        
    }
}

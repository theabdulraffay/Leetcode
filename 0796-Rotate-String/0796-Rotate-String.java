class Solution {
    public static String str(String s){
        String temp = "";
        for(int i = 1; i < s.length();i++){
            temp += s.charAt(i);
        }
        temp += s.charAt(0);
        return temp;
    }
    public boolean rotateString(String s, String goal) {
        for(int i =0;i<s.length();i++){
            s = str(s);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;

        
    }
}

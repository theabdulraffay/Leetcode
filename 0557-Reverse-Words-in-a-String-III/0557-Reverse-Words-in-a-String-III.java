class Solution {
    public static String rev(String s){
		String t = "";
		for(int i = s.length()-1; i >= 0; i--){
			t += s.charAt(i);
		}
		return t;

	}
    
    public String reverseWords(String s) {
        String snew = "";
		String[] n = s.split(" ");
		for(String i : n) {
			String t = rev(i);
			snew += t + " ";
		}
        return snew.substring(0,snew.length()-1);
        
    }
}

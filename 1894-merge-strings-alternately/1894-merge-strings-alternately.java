class Solution {
    public String mergeAlternately(String word1, String word2) {
		String su = "";
		int n  =  word1.length() + word2.length();
		for(int i = 0; i < n; i++){
			if(i == word1.length()){su += word2.substring(i); return su;}
			else if(i == word2.length()){su += word1.substring(i); return su;}
			su = su + word1.charAt(i);
			su = su + word2.charAt(i);

			
		}
        return su;
	}
}
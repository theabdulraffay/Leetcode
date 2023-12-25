class Solution {
    public int minOperations(String s) {
    char f = s.charAt(0) ,l;
		if(f == '1') l = '0';
		else l = '1';
		int c = 0, p = 0;
		for(int i = 0;i<s.length();i++){
            if(i % 2 == 0){
                if(s.charAt(i) != f){c++;}
                if(s.charAt(i) != l){p++;}
            } else{
                if(s.charAt(i) != l){c++;}
                if(s.charAt(i) != f){p++;}
            }
		}
        return Math.min(c,p);
    }
}

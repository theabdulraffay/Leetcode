class Solution {
    public static boolean contains(char[] l, char c){
		for(int i=0; i<l.length; i++){
			if(l[i] == c) return true;
		}
		return false;
	}
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        char[] l1 = r1.toCharArray();
        char[] l2 = r2.toCharArray();
        char[] l3 = r3.toCharArray();
        int c1,c2,c3;
        for(String i : words){
            c1=0;c2=0;c3=0;
            String t = i.toLowerCase();
            for(int j=0;j<i.length();j++){
            	char c = t.charAt(j);
                if(contains(l1,c)){
                    c1++;
                }else if(contains(l2,c)){
                    c2++;
                }else if(contains(l3,c)){
                    c3++;
                }
            }
            if(c1 == i.length() || c3 == i.length() || c2 == i.length()){
                list.add(i);
            }
        }
        String[] s = new String[list.size()];
        for(int i = 0; i < s.length; i++){
        	s[i] = list.get(i);
        }
        return s;

    }
}

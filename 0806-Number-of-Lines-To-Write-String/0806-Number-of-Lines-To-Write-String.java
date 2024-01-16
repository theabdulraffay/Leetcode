class Solution {
    public int[] numberOfLines(int[] widths, String s) {
    int te = 0;
		int counter = 0;

		for(int i =0;i<s.length();i++) {
			te += widths[s.charAt(i) - 'a'];
			 if(te > 100){
				te -= widths[s.charAt(i) - 'a'];
				i--;
				counter++;
				te = 0;
			}
		}
        int[] list = new int[2];
        list[0] = counter + 1;
        list[1] = te;
        return list;
        
    }
}

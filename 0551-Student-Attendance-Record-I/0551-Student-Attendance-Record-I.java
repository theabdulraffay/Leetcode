class Solution {
    public boolean checkRecord(String s) {
        int noOfAs = 0;
        int noOfLs = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') {
                noOfLs++;
            } else {
                noOfLs = 0;
            }
            if (noOfLs == 3) return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') {
                noOfAs++;
            }
            if (noOfAs == 2) return false;
        }
        return true;
        
    }
}

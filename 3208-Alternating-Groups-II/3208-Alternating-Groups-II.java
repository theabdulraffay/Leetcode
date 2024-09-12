class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int start = n - k + 1;
        int count = 1;
        int st = colors[start];
        while(start < n) {
            if(colors[start++ % n] == st) {
                st = st == 1 ? 0 : 1;
                count++;
            }
            else {
                count = 1;
            }
        }
        int toret = 0;

        for(int i = 0; i < n; i++) {
            if(colors[start++ % n] == st) {
                st = st == 1 ? 0 : 1;
                count++;
            }
            else {
                count = 1;
            }

            if(count >= k) toret++;
        }
        return toret;
        
    }
}

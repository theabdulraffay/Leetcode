class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] n = blocks.toCharArray();
        int c = 0;
        for(int i = 0; i < k; i++) {
            if(n[i] == 'W') c++;
        }
        int min = c;
        for(int i = k; i < n.length; i++) {
            if(n[i] == 'W') c++;
            if(n[i-k] == 'W') c--;
            min = Math.min(min, c);
        }
        return min;
        
    }
}

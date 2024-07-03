class Solution {
    int i,j,r,c;

    public Solution(int m, int n) {
        r = m;
        c = n;
        i = 0;
        j = 0;
        
    }
    
    public int[] flip() {
        if(i == r) {
            i = 0;
            j++;
        }

        if(j == c) {
            i = 0;
            j = 0;
        }

        return new int[]{i++, j};
        
    }
    
    public void reset() {

        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */

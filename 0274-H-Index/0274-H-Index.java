class Solution {
    public int hIndex(int[] citations) {
        // if(citations.length == 1) return citations[0] == 0 ? 0 : 1;
        Arrays.sort(citations);
        int n = citations.length;
        int toret = 1;
        int max = 0;
        for(int i = 0; i < n; i++) {
        //    while(citations[i] >= toret) {
        //     if(n - i >= toret) max = Math.max(max, toret);
        //     toret++;

        //    }
            if(citations[i] >= n-i) return n- i;
        }
        return max;
        
    }
}

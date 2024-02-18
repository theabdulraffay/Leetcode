class Solution {
    public int search(int[] n, int t) {
        int s = 0;
        int e = n.length - 1;
        while(s <= e){
            int m = s + (e- s)/2;
            if( n[m] == t){
                return m;
            }else if(n[m] > t){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return -1;
    }
}
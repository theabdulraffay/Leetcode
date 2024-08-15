class Solution {
    public int hIndex(int[] citations) {
        int st = 1;
        int en = citations.length;
        int toret = 0;
        while(st <= en) {
            int mid = st + (en - st)/2;
            if(mid <= citations[citations.length - mid]) {
                toret = mid;
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }
        return toret;
    }
}

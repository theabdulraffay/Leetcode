class Solution {
    int Tnegative(int[] n){
        int start = 0;
        int end = n.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(n[mid] < 0){
                ans = mid;
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return ((ans != -1) ? (n.length - ans): 0);
    }
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for(int[] i : grid){
            int temp = Tnegative(i);
            sum += temp;
        }
        return sum;
        
    }
}

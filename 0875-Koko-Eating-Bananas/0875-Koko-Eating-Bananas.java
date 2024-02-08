class Solution {
    int piles(int[] n, int h){
        int sum =0;
        for(int i : n){
            if(i%h==0){
                sum += i/h;
            }else{
                sum += i/h + 1;
            }
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        // int max = piles[0];
        // for(int i : piles){
        //     if(i > max)max = i;
        // }
        int start = 1;
        int end = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int hours = piles(piles, mid);
            // if(hours == h){
            //     return mid;
            // }else 
            if(hours <= h){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}

class Solution {
    public boolean isPerfectSquare(int num) {
        // int k =(int) Math.sqrt(num);
        // return k*k == num;
        int start = 1;
        int end = num/2;
        if(num == 1)return true;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long k = mid * mid;
            if(k == num){
                return true;
            }
           else if(mid<num/mid ){
                start  = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}

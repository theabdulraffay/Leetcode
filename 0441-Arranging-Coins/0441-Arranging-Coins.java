class Solution {
    public int arrangeCoins(int n) {
    int start = 0;
		int end = n;
		while (start <= end){
			long mid = start + (end - start) / 2;
			long k = (mid *(mid + 1)) / 2;
            //long k = (long)((mid%2==0)? (mid/2)*(mid+1) : ((mid+1)/2) * mid);
            if(k == n){
                return (int)mid;
            }
      			else if(k > n){
      				end = (int)mid - 1;
      			}else{
      				start = (int)mid + 1;
      			}
		}
    return end;       
    }
}

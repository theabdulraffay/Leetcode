class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> que = new ArrayList<>();
        int k = 1;
        for(int i=0; i<n; i++){
            int sum = 0; 
            for(int j=i; j<n; j++){
                sum += nums[j];
                que.add(sum);
            }
        }
        // while(k++ < left) {
        //     que.poll();
        // }
        int sum = 0;
        int mod = 1000000007;
        // while(k++ <= right + 1) {
        //     sum = (sum + que.poll()) % mod; 
        // }
        Collections.sort(que);
        for(int i = left - 1; i < right; i++) {

            sum = (sum + que.get(i )) % mod; 
        }
        return sum;

        
    }
}

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return ((prices[0] + prices[1] <= money) ? money - (prices[0] + prices[1]) : money);

        //         int ans = Integer.MAX_VALUE;
        // int fin;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (i != j ) {
        //             int sum = arr[i] + arr[j];
        //             ans = Math.min(ans, sum);
        //         }
        //     }
        // }
       
        // fin = key - ans;
        // if(fin>=0){
        // return fin;
        // }
        // else{
        //     return key;
        // }

        
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        st.add(prices[prices.length - 1]);
        for(int i = prices.length - 2;i >= 0; i--) {
            if(st.peek() <= prices[i]) {
                st.add(prices[i]);
            } else {
                int s = st.peek() - prices[i];
                if(s > sum) {
                    sum = s;
                }
            }

        }
        return sum;
        
    }
}

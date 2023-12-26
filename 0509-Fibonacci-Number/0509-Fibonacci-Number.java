class Solution {
    public int fib(int n) {
        int n1 = 1, n2 = 0;
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;

        
    }
}

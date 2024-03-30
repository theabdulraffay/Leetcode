class Solution {
    double helper(double x, int n) {
        if(n == 1)return x;
        if (n == 0)return 1;
        if(n % 2 == 0) {
            double temp = helper(x, n/2); // * helper(x, n/2);
            return temp * temp;
        } else {
            double temp = helper(x, n/2); // * helper(x, n/2) * x; 
            return temp * temp * x;
        }
    }
    public double myPow(double x, int n) {
        if(n < 0) {
            n = n * -1;
            x = 1/x;
        }
        return helper(x, n);

        
        
    }
}

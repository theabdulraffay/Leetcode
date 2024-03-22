class Solution {
    int helper(int n,int m) {
        if (n == 0) return m;
        if(n % 2 == 1) return helper(n -1, m+1);
        return helper(n/2, m + 1);
    }
    public int numberOfSteps(int num) {
        return helper(num, 0);
        
    }
}

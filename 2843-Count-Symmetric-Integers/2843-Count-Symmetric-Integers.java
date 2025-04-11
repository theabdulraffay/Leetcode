class Solution {
    boolean f(String s) {
        int c = 0;
        int p = 0;
        int n = s.length();
        for(int i = 0; i < n/2; i++) {
            c += s.charAt(i) - '0';
            p += s.charAt(n - i - 1) - '0';
        }
        return c == p;
    }
    public int countSymmetricIntegers(int low, int high) {
        
        int sum = 0;
        int i = Math.max(10, low);
        for(;i < 100 && i <= high; i++) {
            if(f(String.valueOf(i))) sum++;
        }
        i = Math.max(i, 1000);
        for(;i < 10000 && i <= high; i++) {
            if(f(String.valueOf(i))) sum++;
        }
        return sum;
    }
}

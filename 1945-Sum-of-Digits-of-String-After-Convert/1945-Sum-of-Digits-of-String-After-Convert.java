class Solution {
    int add(long num) {
        int n = 0;
        while(num > 0) {
            n += num%10;
            num /= 10;
        }
        return n;
    }
    public int getLucky(String s, int k) {
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) - 'a' + 1);
        }
        s = sb.toString();
        for(int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - '0');
        }
        for(int i = 1; i < k; i++) {
            sum = add(sum);
        }
        return (int)sum;
        
    }
}

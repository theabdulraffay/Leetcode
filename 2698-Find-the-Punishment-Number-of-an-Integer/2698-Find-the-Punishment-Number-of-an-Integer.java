class Solution {
    public boolean back(String s, int n, int i) {
        if (i == s.length())
            return n == 0;
        int sum = 0;
        for (; i < s.length(); i++) {
            sum *= 10;
            sum += (s.charAt(i) - '0');
            if (back(s, n - sum, i + 1))
                return true;
        }
        return false;
    }

    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            if (back(Integer.toString(i * i), i, 0))
                sum += i * i;
        return sum;

    }
}

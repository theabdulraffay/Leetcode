class Solution {
    public boolean helper(int n, int i, int sq) {
        if (n <= 0) return n == 0;
        for (; i <= sq; i++) {
            if (helper(n - (int) (Math.pow(3, i)), i + 1, sq)) return true;
        }
        return false;
    }

    public boolean checkPowersOfThree(int n) {
        return helper(n, 0, (int) (Math.log(n) / Math.log(3)));

    }
}

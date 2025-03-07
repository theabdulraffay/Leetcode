class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[] = new boolean[right + 1];
        for (int i = 2; i <= right; i++)
            prime[i] = true;

        for (int p = 2; p <= Math.sqrt(right); p++) {
            if (prime[p]) {
                for (int i = p * p; i <= right; i += p)
                    prime[i] = false;
            }
        }
        int n = -1, min = right + 1, k = -1, j = -1;
        for (int i = left; i <= right; i++) {
            if (prime[i]) {
                if (n == -1) {
                    n = i;
                    continue;
                }
                if (i - n < min) {
                    min = i - n;
                    k = n;
                    j = i;
                }
                n = i;
            }
        }
        return new int[] { k, j };

    }
}

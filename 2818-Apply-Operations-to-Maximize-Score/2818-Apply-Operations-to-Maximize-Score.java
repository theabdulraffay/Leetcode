class Solution {
    int mod = (int) 1e9 + 7;
    int prime(int n) {
        HashSet<Integer> factors = new HashSet<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            factors.add(n);
        }
        
        return factors.size();
    }
    public int maximumScore(List<Integer> nums, int k) {
        int n = nums.size();
        int[] left  = new int[n];
        int[] right = new int[n];

        int[][] arr = new int[n][0];
        for (int i = 0; i < n; ++i) {
            arr[i] = new int[] {i, prime(nums.get(i)), nums.get(i)};
        }
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()][1] < arr[i][1]) {
                stk.pop();
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear();


        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && arr[stk.peek()][1] <= arr[i][1]) {
                stk.pop();
            }
            right[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }

        Arrays.sort(arr, (a,b) -> b[2] - a[2]);

        long ans = 1;
        for (int i = 0; i < n && k > 0; i++) {

            int val = arr[i][2],  ind = arr[i][0];
            long count = (long) (ind - left[ind]) * (right[ind] - ind);
            long power = Math.min(k, count);
            // ans *= Math.pow(val, power) % mod;
            int multiply = modPow(val,(int) power, mod);
            ans = (int) ((1L * ans * multiply) % mod);
            k -= power;
        }

        return (int) ans % mod;
        
    }
    int modPow(int base, int exp, int mod) {
        long result = 1;
        long b = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            exp >>= 1;
        }
        return (int) result;
    }

}

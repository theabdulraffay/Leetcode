class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // HashSet<Integer> set = new HashSet<>();
        boolean[] set = new boolean[n + 1];
        for (int i : banned) if(i <= n) set[i] = true;
        int c = 0;
        int sum = 0;
        for(int i = 1; i < n +1; i++) {
            if(!set[i]) {
                sum += i;
                c++;
            }
            if(sum > maxSum) return c - 1;
        }
        return c;
        
    }
}

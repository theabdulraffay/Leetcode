class Solution {
    HashMap<Long, Integer> map;
    HashSet<Long> set;

    int check(long n) {
        if (!set.contains(n))
            return 0;
        if (map.containsKey(n))
            return map.get(n);

        int result = check(n * n) + 1;
        map.put(n, result);
        return result;
    }

    public int longestSquareStreak(int[] nums) {
        set = new HashSet<>();
        map = new HashMap<>();
        for (int i : nums)
            set.add((long)i);

        int max = -1;
        for (long i : set) {
            int temp = check(i);
            if (temp >= 2) {
                max = Math.max(max, temp);
            }
        }

        return max;

    }
}

class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0;
        boolean c = nums[0] % 2 == 0;
        for (int i = 0; i < n; i++) {
            boolean temp = nums[i] % 2 == 0;
            if ((c && temp) || (!c && !temp)) {
                c = !c;
            } else {
                c = nums[i] % 2 == 1;
                while (left < i) {
                    arr[left++] = i - 1;
                }
            }
        }
        while (left < n) {
            arr[left++] = n - 1;
        }
        boolean[] toret = new boolean[queries.length];
        for (int i = 0; i < toret.length; i++) {
            toret[i] = arr[queries[i][0]] >= queries[i][1];
        }
        return toret;

    }
}

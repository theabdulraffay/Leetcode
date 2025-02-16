class Solution {
    boolean helper(int[] arr, boolean[] used, int n, int index) {
        while (index < arr.length && arr[index] != 0) {
            index++;
        }
        if (index == arr.length) {
            return true;
        }
        for (int i = n; i > 0; i--) {
            if (used[i])
                continue;

            if (i == 1) {
                arr[index] = 1;
                used[1] = true;
                if (helper(arr, used, n, index + 1))
                    return true;
                arr[index] = 0;
                used[1] = false;

            } else {
                if (index + i < arr.length && arr[index + i] == 0) {
                    arr[index] = i;
                    arr[index + i] = i;
                    used[i] = true;
                    if (helper(arr, used, n, index + 1))
                        return true;
                    arr[index] = 0;
                    arr[index + i] = 0;
                    used[i] = false;
                }
            }
        }
        return false;

    }

    public int[] constructDistancedSequence(int n) {
        int[] arr = new int[n * 2 - 1];
        helper(arr, new boolean[n + 1], n, 0);
        return arr;

    }
}

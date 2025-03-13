class Solution {

    boolean helper(int[] nms, int[][] que, int en) {
        int[] arr = new int[nms.length + 1];
        
        for(int i = 0; i < en; i++) {
            int left = que[i][0], right = que[i][1], val = que[i][2];
            arr[left] += val;
            arr[right + 1] -= val;
        }

        int sum = 0;
        for(int i = 0; i < nms.length;i++) {
            sum += arr[i];
            if (sum < nms[i]) return false;
        }

        return true;

    }
    public int minZeroArray(int[] nums, int[][] queries) {
        int st = 0, en = queries.length;

        if(!helper(nums, queries, en)) return -1;

        while(st <= en) {
            int mid = st + (en - st) / 2;
            if(helper(nums, queries, mid)) en = mid - 1;
            else st = mid + 1;
        }
        return st;

        
    }
}

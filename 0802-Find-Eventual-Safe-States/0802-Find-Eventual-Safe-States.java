class Solution {
    Boolean[] dp;
    boolean check(int[][] arr, int index) {
        if (dp[index] != null) return dp[index];
        if (arr[index].length == 0) {
            return dp[index] = true;
        }
        dp[index] = false;
        for (int i : arr[index]) {
            if (!check(arr, i)) return dp[index] = false;

        }
        return dp[index] = true;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        dp = new Boolean[graph.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (check(graph, i)) list.add(i);
        }
        return list;
        
    }
}

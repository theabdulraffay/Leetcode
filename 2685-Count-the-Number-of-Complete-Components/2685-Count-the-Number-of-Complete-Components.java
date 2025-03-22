class Solution {
    void dfs(List<Integer> a, int i, List<List<Integer>> adj, boolean[] vis) {
        a.add(i);
        vis[i] = true;
        for (int it : adj.get(i)) {
            if (!vis[it]) {
                dfs(a, it, adj, vis);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                List<Integer> a = new ArrayList<>();
                dfs(a, i, adj, vis);

                boolean check = true;
                for (int node : a) {
                    if (adj.get(node).size() != a.size() - 1) {
                        check = false;
                        break;
                    }
                }

                if (check) ans++;
            }
        }
        return ans;
    }
}

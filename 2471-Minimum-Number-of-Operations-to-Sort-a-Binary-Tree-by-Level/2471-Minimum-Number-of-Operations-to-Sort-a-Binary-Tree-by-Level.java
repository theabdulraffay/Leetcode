class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public static int minSwaps(int[] arr) {
        int n = arr.length;
        ArrayList<Pair> arrpos = new ArrayList<Pair>();
        for (int i = 0; i < n; i++)
            arrpos.add(
                    new Pair(arr[i], i));
        arrpos.sort(
                new Comparator<Pair>() {
                    @Override
                    public int compare(
                            Pair o1,
                            Pair o2) {
                        if (o1.first < o2.first)
                            return -1;
                        else if (o1.first == o2.first)
                            return 0;

                        else
                            return 1;
                    }
                });
        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i] || arrpos.get(i).second == i)
                continue;
            int cycle_size = 0;
            int j = i;
            while (!vis[j]) {
                vis[j] = true;

                j = arrpos.get(j).second;
                cycle_size++;
            }

            if (cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }

        return ans;
    }

    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int toret = 0;
        while (!que.isEmpty()) {
            int n = que.size();
            int[] digest = new int[n];
            for (int i = 0; i < n; i++) {
                TreeNode temp = que.poll();
                digest[i] = temp.val;
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
            toret += minSwaps(digest);
        }
        return toret;

    }
}

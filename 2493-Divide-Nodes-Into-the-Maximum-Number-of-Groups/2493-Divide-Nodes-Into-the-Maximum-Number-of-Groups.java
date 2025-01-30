class Solution {

    public int magnificentSets(int n, int[][] edges) {
        // int n = edges.length;
        ArrayList<Integer>[] arr = new ArrayList[n];
        for(int i = 0; i < n; i++) arr[i] = new ArrayList<>();
        for (int[] i : edges) {
            arr[i[0] - 1].add(i[1] - 1);
            arr[i[1] - 1].add(i[0] - 1);
        }

        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        for (int i = 0; i < n; i++) {
            if (colors[i] != -1) continue;
            colors[i] = 0;
            if (!isBarpartite(arr, i, colors)) return -1;
        }
        int max = 0;
        int[] distance = new int[n];
        for(int i = 0; i < n; i++) {
            distance[i] = longestDistance(arr, i, n);
        }

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(visited[i]) continue;
            max += numberOfGroups(arr, i, distance, visited);
        }
        return max;

        
    }

    boolean isBarpartite(ArrayList<Integer>[] arr, int node, int[] colors) {
        for (int i : arr[node]) {
            if(colors[i] == colors[node]) return false;
            if (colors[i] != -1) continue;
            colors[i] = (colors[node] + 1) % 2;
            if (!isBarpartite(arr, i, colors)) return false;
        }
        return true;
    }


    int longestDistance(ArrayList<Integer>[]arr, int node, int n) {
        Queue<Integer> que = new LinkedList<Integer>();
        boolean[] visited = new boolean[n];

        que.add(node);
        visited[node] = true;
        int distance = 0;
        while(!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int curr = que.poll();
                for (int adj : arr[curr]) {
                    if(visited[adj]) continue;
                    visited[adj] = true;
                    que.add(adj);
                }
            }
                distance++;
        }
        return distance;
    } 

    int numberOfGroups(ArrayList<Integer>[] arr, int i, int[] distances, boolean[] visited) {
        int max = distances[i];
        visited[i] = true;

        for(int adj : arr[i]) {
            if (visited[adj]) continue;
            max = Math.max(max, numberOfGroups(arr, adj, distances, visited));
        }
        return max;
    }
}

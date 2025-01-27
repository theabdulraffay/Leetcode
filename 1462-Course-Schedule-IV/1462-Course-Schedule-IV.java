class Solution {
    boolean BFS(ArrayList<Integer>[] arr, int start, int end) {
        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[arr.length];
        if (arr[start] != null)
        que.addAll(arr[start]);
        while (!que.isEmpty()) {
            int req = que.poll();
            if(visited[req]) continue;
            if (req == end) return true;
            visited[req] = true;
            if (arr[req] != null) que.addAll(arr[req]);
        }
        return false;
    }
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        ArrayList<Integer>[] arr = new ArrayList[numCourses];
        List<Boolean> toret = new ArrayList<>();
        

        for (int[] i : prerequisites) {
            int pre = i[0], sub = i[1];
            if (arr[pre] == null) arr[pre] = new ArrayList<>();
            arr[pre].add(sub);
        }
        for(int[] i : queries) {
            toret.add(BFS(arr, i[0], i[1]));
        }
        return toret;

        
    }
}

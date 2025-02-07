class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> s1 = new HashMap<>();
        HashMap<Integer, Integer> s2 = new HashMap<>();
        int[] arr = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int[] i = queries[k];
            if(s1.containsKey(i[0])) {
                int x = s1.get(i[0]);
                s2.put(x , s2.get(x) - 1);
                if(s2.get(x) == 0) s2.remove(x);
            }
            s1.put(i[0], i[1]);
            s2.put(i[1], s2.getOrDefault(i[1], 0) + 1);
            arr[k] = s2.size();
        }
        return arr;
    }
}

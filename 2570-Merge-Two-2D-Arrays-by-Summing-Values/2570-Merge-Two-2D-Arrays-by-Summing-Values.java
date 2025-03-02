class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int[] i : nums1) {
            que.add(i[0]);
            map.put(i[0], i[1]);
        }
        

        for (int[] i : nums2) {
            if(map.containsKey(i[0])) {
                map.put(i[0], map.get(i[0]) + i[1]);
            } else {
                que.add(i[0]);
                map.put(i[0], i[1]);
            }
        }

        int[][] toret = new int[que.size()][2];
        int i = 0;

        while(!que.isEmpty()) {
            toret[i++] = new int[]{que.peek(), map.get(que.poll())};
        }
        return toret;
    }
}

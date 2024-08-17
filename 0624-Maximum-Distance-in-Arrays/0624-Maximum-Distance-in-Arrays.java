class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // Collections.sort(arrays, new Comparator<List<Integer>>() {
        //     @Override
        //     public int compare(List<Integer> e1, List<Integer> e2) {
        //         return e1.get(0) - e2.get(0);
        //     }
        // });
        // int e = arrays.get(0).get(0);
        // int max = Integer.MIN_VALUE;
        // for (int i = 1; i < arrays.size(); i++) {
        //     max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
        // }
        // int temp1 = max - e;

        // Collections.sort(arrays, new Comparator<List<Integer>>() {

        //     @Override
        //     public int compare(List<Integer> e1, List<Integer> e2) {
        //         return e1.get(e1.size() - 1) - e2.get(e2.size() - 1);
        //     }
        // });
        // e = arrays.get(arrays.size() - 1).get(arrays.get(arrays.size() - 1).size() - 1);
        // max = Integer.MAX_VALUE;
        // for (int i = 0; i < arrays.size() - 1; i++) {
        //     max = Math.min(max, arrays.get(i).get(0));
        // }
        // int temp2 = e - max;
        // return Math.max(temp1, temp2);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int min = arrays.get(0).get(0);
        int toret = 0;

        for(int i = 1; i < arrays.size(); i++) {
            toret = Math.max(toret, arrays.get(i).get(arrays.get(i).size() - 1) - min);
            toret = Math.max(toret, max - arrays.get(i).get(0));
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
            min = Math.min(min, arrays.get(i).get(0));
        }
        return toret;





    }
}

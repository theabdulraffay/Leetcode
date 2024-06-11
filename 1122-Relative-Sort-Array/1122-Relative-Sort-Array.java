class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < arr1.length; i++) {
            map2.put(arr1[i], map2.getOrDefault(arr1[i], 0) + 1);
        }

        int[] toret= new int[arr1.length];
        int k = 0;
        for(int j : arr2) {
            int c = map2.get(j);
            while(c > 0) {
                toret[k++] = j;
                c--;
            }
            map2.remove(j);
        }

        int[] remi = new int[arr1.length - k];
        int ind = 0;
        for(int j : arr1) {
            if(map2.containsKey(j)) {
                int c = map2.get(j);
                while(c > 0) {
                    remi[ind++] = j;
                    c--;
                }
                map2.remove(j);
            }
        }
        Arrays.sort(remi);
        for(int j : remi) {
            toret[k] = j;
            k++;
        }
        return toret;
    }
}

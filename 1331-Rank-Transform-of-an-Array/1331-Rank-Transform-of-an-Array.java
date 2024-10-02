class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int c = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(copy[i])) {
                map.put(copy[i], c++);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            copy[i] = map.get(arr[i]);
        }
        return copy;

        
    }
}

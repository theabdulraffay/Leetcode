// import java.util.Map.Entry;
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(map.entrySet());
        freqList.sort(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : freqList) {
            if (k >= entry.getValue()) {
                k = k - entry.getValue();
                map.remove(entry.getKey());
            } else {
                break;
            }
        }

        return map.size();
        
        
    }
} 

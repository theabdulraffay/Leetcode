import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));

        // Sort the list using a comparator that compares the values
        // entryList.sort(Map.Entry.comparingByValue());
        int[] toret = new int[k];
        int i = 0;
        while(k-- > 0) {
            toret[i] = entryList.get(entryList.size() - 1- i).getKey();
            i++;
        }

        return toret;
        
    }
}

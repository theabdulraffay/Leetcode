class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char te = s.charAt(i);
            map.put(te, map.getOrDefault(te, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> freqList = new ArrayList<>(map.entrySet());
        freqList.sort(Comparator.comparingInt(Map.Entry::getValue));

        StringBuilder str = new StringBuilder();

        for(int i = freqList.size() - 1; i >= 0; i--) {
            int freq = freqList.get(i).getValue();
            char ch = freqList.get(i).getKey();
            for (int j = 0; j < freq; j++) {
                str.append(ch);
            }
        }
        return str.toString();
        
    }
}

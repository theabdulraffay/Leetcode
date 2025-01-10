class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> l = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (String i : words2){
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (char j : i.toCharArray()) {
                map2.put(j, map2.getOrDefault(j, 0) + 1);
            }
            for(char e : map2.keySet()) {
                if(map.containsKey(e)) {
                    map.put(e, Math.max(map.get(e), map2.get(e)));
                } else map.put(e, map2.get(e));
            }

        }

        
        for (String i : words1) {
            HashMap<Character, Integer> ano = new HashMap<>(map);
            for (char j : i.toCharArray()) {
                if (ano.containsKey(j)) {
                    ano.put(j, ano.get(j) - 1);
                    if (ano.get(j) == 0)
                        ano.remove(j);
                }
            }
            if (ano.isEmpty())
                l.add(i);
        }
        return l;

    }
}

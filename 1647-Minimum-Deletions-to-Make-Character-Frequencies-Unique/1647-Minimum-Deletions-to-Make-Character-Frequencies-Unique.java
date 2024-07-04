class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char te = s.charAt(i);
            map.put(te, map.getOrDefault(te, 0) + 1);
        }

        int toret = 0;
        HashSet<Integer> set = new HashSet<>();

        for(Character k : map.keySet()) {
            int freq = map.get(k);
            while(freq > 0 && set.contains(freq)) {
                freq--;
                toret++;
            }
            set.add(freq);
        }
        return toret;
    }
}

class Solution {
    HashMap<String, Integer> freq = new HashMap<>();
    int skip = 0;
    
    boolean check(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i <= s.length() - skip; i += skip) {
            String p = s.substring(i, i + skip);
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        return map.equals(freq);
    }
    public List<Integer> findSubstring(String s, String[] words) {
        skip = words[0].length();
        int len = words.length * skip;
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // iterates every single position
        List<Integer> matchedIndexes = new ArrayList<>();
        for (int i = 0; i <= s.length() - len; i++) {
            if (check(s.substring(i, i + len))){
                matchedIndexes.add(i);
            }
        }

        return matchedIndexes;

        
    }
}

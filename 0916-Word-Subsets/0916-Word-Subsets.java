class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> l = new ArrayList<>();
        int[] map = new int[26], counter;
        for (String i : words2) {
            counter = new int[26];
            for (char j : i.toCharArray()) {
                counter[j - 'a']++;
            }
            for (int c = 0; c < 26; c++) {
                map[c] = Math.max(map[c], counter[c]);
            }
        }

        for (String i : words1) {
            counter = new int[26];
            for (char j : i.toCharArray()) {
                counter[j - 'a']++;
            }
            boolean x = true;
            for (int c = 0; c < 26; c++) {
                if (counter[c] < map[c]) {
                    x = false;
                    break;
                }
            }
            if (x)
                l.add(i);
        }
        return l;

    }
}

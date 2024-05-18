class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false; 
        else if (word1.equals(word2))  return true; 
        char[] f = word1.toCharArray();
        char[] s = word2.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < f.length; i++) {
            map1.put(f[i], map1.getOrDefault(f[i], 0) + 1);
            map2.put(s[i], map2.getOrDefault(s[i], 0) + 1);

        }
        for (char c : map1.keySet()) {
            if (!map2.containsKey(c)) {
                return false;
            }
        }

        ArrayList<Integer> arr1 = new ArrayList<>(map1.values());
        ArrayList<Integer> arr2 = new ArrayList<>(map2.values()); 
        Collections.sort(arr1);
        Collections.sort(arr2);
        return arr1.equals(arr2);
    }
}

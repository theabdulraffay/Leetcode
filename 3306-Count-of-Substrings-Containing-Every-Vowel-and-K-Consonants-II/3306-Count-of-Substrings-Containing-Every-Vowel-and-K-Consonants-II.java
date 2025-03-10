class Solution {
    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    long helper(String word, int k) {
        long c = 0;
        int consonants = 0;
        int n = word.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) map.put(ch, map.getOrDefault(ch, 0) + 1);
            else consonants++;
            while (map.size() == 5 && consonants >= k) {
                c += n - i;
                ch = word.charAt(left++);
                if(!isVowel(ch)) consonants--;
                else {
                    map.put(ch, map.get(ch) - 1);
                    if(map.get(ch) == 0) map.remove(ch);
                }
            }
        }

        return c;
    }
    public long countOfSubstrings(String word, int k) {
        return helper(word, k) - helper(word, k + 1);
        
    }
}

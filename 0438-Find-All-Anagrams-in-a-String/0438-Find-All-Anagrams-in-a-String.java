class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        List<Integer> toret = new ArrayList<>();
        if(s.length() < p.length()) return toret;
        for(int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        }
        if(map.equals(map2)) {
            toret.add(0);
        }

        int i = p.length();
        int n = p.length();
        while(i < s.length()) {
            char ch = s.charAt(i - n);
            map2.put(ch, map2.get(ch) - 1);
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
            if(map2.get(ch) == 0) map2.remove(ch);


            if(map.equals(map2)) {
                toret.add(i - n + 1);
            }
            i++;
        }
        return toret;
        
    }
}

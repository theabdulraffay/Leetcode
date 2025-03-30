class Solution {
    boolean check(HashSet<Character> set, HashMap<Character, Integer> map) {
        for(char c : set) if(map.containsKey(c)) return false;
        return true;
    }
    public List<Integer> partitionLabels(String s) {
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> map =new HashMap<>();
        List<Integer> toret = new ArrayList<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        } 

        int left = -1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            set.add(c);
            if(map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) - 1);
                if(map.get(c) == 0) {
                    map.remove(c);
                    if (check(set, map)) {
                        toret.add(i - left);
                        left = i;
                        set.clear();
                    }
                }
                
            }
        }
        return toret;
        
    }
}

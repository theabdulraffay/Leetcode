class Solution {
    HashSet<String> set;
    void helper(String s, boolean[] used, StringBuilder n) {
        set.add(n.toString());
        for (int i =0; i < s.length(); i++) {
            if(used[i]) continue;
            n.append(s.charAt(i));
            used[i] = true;
            helper(s, used, n);
            n.deleteCharAt(n.length() - 1);
            used[i] = false;
        }
    }
    public int numTilePossibilities(String tiles) {
        set = new HashSet<>();
        helper(tiles, new boolean[tiles.length()], new StringBuilder());
        return set.size() - 1;
        
    }
}

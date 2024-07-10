class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        int len = 10;
        List<String> res = new ArrayList<String>();
        if(s.length() < 10) return res;
        
        HashSet<String> set = new HashSet<>();
        HashSet<String> added = new HashSet<>();
        for (int i = 0; i <= s.length() - len; i++) {
            String resStr = s.substring(i, i + len);
            if (set.contains(resStr) && !added.contains(resStr)) {
                added.add(resStr);
            }
            set.add(resStr);
        }
        res.addAll(added);
        return res;

    }
}

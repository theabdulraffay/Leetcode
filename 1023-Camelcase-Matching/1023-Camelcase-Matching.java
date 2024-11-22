class Solution {
    boolean helper(String s, String n) {
        int j = 0;
        for(int i = 0 ; i < s.length(); i++) {
            char c  = s.charAt(i);
            if(j < n.length() && c == n.charAt(j)) j++;
            else if(Character.isUpperCase(c)) return false;
        }
        return j == n.length(); 
    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < queries.length; i++) {
            list.add(helper(queries[i], pattern));
        }

        return list;
        
    }
}

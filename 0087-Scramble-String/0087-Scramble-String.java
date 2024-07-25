class Solution {
    Map<String, Boolean> map = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        if (n != s2.length()) {
            return false;
        }
        if(s1.equals(s2) || n == 0) return true;

        String temp = s1 + s2;
        if(map.containsKey(temp)) return map.get(temp);

        if(n == 1) return false;
        for(int i = 1; i <= n - 1; i++) {
            if(isScramble(s1.substring(0, i), s2.substring(0, i)) && 
            isScramble(s1.substring(i), s2.substring(i))){ // unswap condition
                map.put(temp, true);
                 return true;
            }

            if(isScramble(s1.substring(0, i), s2.substring(n - i)) && 
            isScramble(s1.substring(i), s2.substring(0, n - i))){ // swap condition
                map.put(temp, true);
                return true;
            }
        }
        map.put(temp, false);
        return false;
    }
}

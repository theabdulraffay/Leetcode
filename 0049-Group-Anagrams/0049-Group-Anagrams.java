class Solution {
    // boolean check(String fi, String se) {
    //     if(fi.length() != se.length()) return false;
    //     char[] a = fi.toCharArray();
    //     char[] b = se.toCharArray();
    //     Arrays.sort(a);
    //     Arrays.sort(b);
    //     for(int i = 0; i < a.length; i++) {
    //         if(a[i] != b[i]) return false;
    //     }
    //     return true;
    // }


    // boolean check(String fi, String se) {
    //     if(fi.length() != se.length()) return false;
    //     HashMap<Character, Integer> m = new HashMap<>();
    //     HashMap<Character, Integer> n = new HashMap<>();
    //     for(int i = 0; i < fi.length(); i++) {
    //         m.put(fi.charAt(i), m.getOrDefault(fi.charAt(i), 0) + 1);
    //         n.put(se.charAt(i), n.getOrDefault(se.charAt(i), 0) + 1);

    //     }
    //     for(int i = 0; i < fi.length(); i++) {
    //         char c = fi.charAt(i);
    //         if(!n.containsKey(c) || m.get(c) != n.get(c)) return false;
    //     }
    //     return true;
    // }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> fina = new ArrayList<>();

        // boolean[] ch = new boolean[strs.length];
        // for(int i = 0; i < strs.length; i++) {
        //     if(ch[i]) continue;
        //     List<String> s = new ArrayList<>();
        //     s.add(strs[i]);
        //     ch[i] = true;
        //     for(int j = i + 1; j < strs.length; j++) {
        //         if(check(strs[i], strs[j])) {
        //             s.add(strs[j]);
        //             ch[j] = true;
        //         }
        //     }
        //     fina.add(s);
        // }

        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        for(String k : map.keySet()) {
            fina.add(map.get(k));
        }


        return fina;
    }
}

class Solution {
    // HashMap<Character, Integer> main;
    // HashMap<Character, Integer> assistant;

    // boolean contains() {
    //     for(char c : main.keySet()) {
    //         if(!assistant.containsKey(c)) return false;
    //         if(assistant.get(c) < main.get(c)) return false;
    //     }
    //     return true;
    // }
    // public String minWindow(String s, String t) {
    //     if(s.length() < t.length()) return "";
    //     main = new HashMap<>();
    //     assistant = new HashMap<>();
    //     for(char c : t.toCharArray()) {
    //         main.put(c, main.getOrDefault(c, 0) + 1);
    //     }

    //     int left = 0;
    //     int min = Integer.MAX_VALUE;
    //     int toret = 0;
    //     char[] str = s.toCharArray();
    //     for(int i = 0; i < s.length(); i++) {
    //         char c = str[i];
    //         assistant.put(c, assistant.getOrDefault(c, 0) + 1);
    //         while(contains()) {
    //             if(i - left + 1 < min) {
    //                 min = i - left + 1;
    //                 toret = left;
    //             }
    //             char m = str[left++];
    //             assistant.put(m, assistant.get(m) - 1);
    //             if(assistant.get(m) == 0) assistant.remove(m);
    //         }
    //     }

    //     return min == Integer.MAX_VALUE ? "" : s.substring(toret, toret + min);
    // }
    int[] main;
    int[] assistant;

    boolean contains() {
    for (int i = 0; i < main.length; i++) {
        if (main[i] > assistant[i]) return false;
    }
    return true;
}
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        main = new int[58];
        assistant = new int[58];
        for(char c : t.toCharArray()) {
            main[c - 'A']++;
        }

        int left = 0;
        int min = Integer.MAX_VALUE;
        int toret = 0;
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++) {
            char c = str[i];
            assistant[c - 'A']++;
            while(contains()) {
                if(i - left + 1 < min) {
                    min = i - left + 1;
                    toret = left;
                }
                char m = str[left++];
                assistant[m - 'A']--;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(toret, toret + min);
    }

}
